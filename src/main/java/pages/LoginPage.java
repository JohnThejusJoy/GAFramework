package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * LoginPage represents the login page of the application.
 * This page object encapsulates elements and actions related to user login functionality.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class LoginPage extends BasePage {

	/**
	 * Username input field element.
	 */
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	/**
	 * Password input field element.
	 */
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	/**
	 * Sign-in submit button element.
	 */
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signin;

	/**
	 * Constructor for LoginPage that initializes the page object.
	 *
	 * @param driver The WebDriver instance to be used for browser automation
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Enters the username in the username field.
	 * Uses method chaining to return the LoginPage instance.
	 *
	 * @param usernamevalue The username value to be entered
	 * @return LoginPage instance for method chaining
	 */
	public LoginPage enterusername(String usernamevalue) {
		pageUtility.sendDataToElement(username, usernamevalue);
		return this;
	}

	/**
	 * Enters the password in the password field.
	 * Uses method chaining to return the LoginPage instance.
	 *
	 * @param passwordvalue The password value to be entered
	 * @return LoginPage instance for method chaining
	 */
	public LoginPage enterPassword(String passwordvalue) {
		pageUtility.sendDataToElement(password, passwordvalue);
		return this;
	}

	/**
	 * Performs the sign-in action by clicking the sign-in button.
	 * Waits for the button to be clickable before performing the action.
	 * Navigates to the HomePage upon successful sign-in.
	 *
	 * @return HomePage instance after successful sign-in
	 */
	public HomePage signIn() {
		waitUtility.waitUntilClickable(driver, signin);
		pageUtility.clickOnElement(signin);
		return new HomePage(driver);
	}
}