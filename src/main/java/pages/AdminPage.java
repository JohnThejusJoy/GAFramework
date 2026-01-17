package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * AdminPage represents the admin management page of the application.
 * This page object encapsulates elements and actions related to admin user management functionality.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class AdminPage extends BasePage {

	/**
	 * New admin button element.
	 */
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newadmin;

	/**
	 * Admin username input field element.
	 */
	@FindBy(xpath = "//input[@type='text' and @class='form-control' and @id='username']")
	private WebElement adminusername;

	/**
	 * Admin password input field element.
	 */
	@FindBy(xpath = "//input[@type='password' and @class='form-control' and @id='password']")
	private WebElement adminpassword;

	/**
	 * User type dropdown element.
	 */
	@FindBy(xpath = "//select[@class='form-control' and @id='user_type']")
	private WebElement dropdown;

	/**
	 * Save button element.
	 */
	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-block-sm btn-danger' and @name='Create']")
	private WebElement savebtn;

	/**
	 * Success alert message element.
	 */
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	/**
	 * Constructor for AdminPage that initializes the page object.
	 *
	 * @param driver The WebDriver instance to be used for browser automation
	 */
	public AdminPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Clicks on the new admin button to initiate admin creation.
	 * Waits for the button to be clickable before performing the action.
	 * Uses method chaining to return the AdminPage instance.
	 *
	 * @return AdminPage instance for method chaining
	 */
	public AdminPage newAdmin() {
		waitUtility.waitUntilClickable(driver, newadmin);
		pageUtility.clickOnElement(newadmin);
		return this;
	}

	/**
	 * Enters the username for the new admin user.
	 * Uses method chaining to return the AdminPage instance.
	 *
	 * @param username The username value to be entered
	 * @return AdminPage instance for method chaining
	 */
	public AdminPage adminUsername(String username) {
		pageUtility.sendDataToElement(adminusername, username);
		return this;
	}

	/**
	 * Enters the password for the new admin user.
	 * Uses method chaining to return the AdminPage instance.
	 *
	 * @param password The password value to be entered
	 * @return AdminPage instance for method chaining
	 */
	public AdminPage adminPassword(String password) {
		pageUtility.sendDataToElement(adminpassword, password);
		return this;
	}

	/**
	 * Selects the admin user type from the dropdown menu.
	 * Uses method chaining to return the AdminPage instance.
	 *
	 * @return AdminPage instance for method chaining
	 */
	public AdminPage adminDropdown() {
		pageUtility.selectData(dropdown);
		return this;
	}

	/**
	 * Clicks the save button to create the new admin user.
	 * Uses method chaining to return the AdminPage instance.
	 *
	 * @return AdminPage instance for method chaining
	 */
	public AdminPage adminSave() {
		pageUtility.clickOnElement(savebtn);
		return this;
	}

	/**
	 * Checks if the success alert message is displayed after admin creation.
	 *
	 * @return true if the alert is displayed, false otherwise
	 */
	public boolean isAlertDisplayed() {
		return pageUtility.alertDisplay(alert);
	}
}
