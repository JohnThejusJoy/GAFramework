package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * HomePage represents the home page of the application.
 * This page object encapsulates elements and actions related to home page functionality.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class HomePage extends BasePage {

	/**
	 * Admin button dropdown element.
	 */
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement adminbtn;

	/**
	 * Logout button element.
	 */
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	private WebElement logoutbtn;

	/**
	 * Manage admin info link element.
	 */
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	private WebElement manageadmininfo;

	/**
	 * Manage news button element.
	 */
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	private WebElement managenewsbtn;

	/**
	 * Constructor for HomePage that initializes the page object.
	 *
	 * @param driver The WebDriver instance to be used for browser automation
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Clicks on the admin button to access admin dropdown menu.
	 * Waits for the button to be clickable before performing the action.
	 *
	 * @return AdminPage instance after clicking the admin button
	 */
	public AdminPage adminButton() {
		waitUtility.waitUntilClickable(driver, adminbtn);
		pageUtility.clickOnElement(adminbtn);
		return new AdminPage(driver);
	}

	/**
	 * Performs the logout action by clicking the logout button.
	 * Waits for the button to be clickable before performing the action.
	 *
	 * @return LoginPage instance after logout
	 */
	public LoginPage logOut() {
		waitUtility.waitUntilClickable(driver, logoutbtn);
		pageUtility.clickOnElement(logoutbtn);
		return new LoginPage(driver);
	}

	/**
	 * Navigates to the admin information management page.
	 * Clicks on the manage admin info link.
	 *
	 * @return AdminPage instance for managing admin information
	 */
	public AdminPage adminInfo() {
		pageUtility.clickOnElement(manageadmininfo);
		return new AdminPage(driver);
	}

	/**
	 * Navigates to the news management page.
	 * Clicks on the manage news button.
	 *
	 * @return NewsPage instance for managing news
	 */
	public NewsPage manageNews() {
		pageUtility.clickOnElement(managenewsbtn);
		return new NewsPage(driver);
	}
}
