package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * NewsPage represents the news management page of the application.
 * This page object encapsulates elements and actions related to news management functionality.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class NewsPage extends BasePage {

	/**
	 * New news button element.
	 */
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newnewsbtn;

	/**
	 * News text textarea element.
	 */
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newstxt;

	/**
	 * Save button element.
	 */
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebtn;

	/**
	 * Search button element.
	 */
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchbtn;

	/**
	 * Search field input element.
	 */
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchfield;

	/**
	 * Search news button element.
	 */
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement searchnewsbtn;

	/**
	 * Home button element to navigate back to home page.
	 */
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homebtn;

	/**
	 * Reset button element.
	 */
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetbtn;

	/**
	 * Success alert message element.
	 */
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	/**
	 * Constructor for NewsPage that initializes the page object.
	 *
	 * @param driver The WebDriver instance to be used for browser automation
	 */
	public NewsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Clicks on the new news button to initiate news creation.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage newNews() {
		pageUtility.clickOnElement(newnewsbtn);
		return this;
	}

	/**
	 * Enters news text in the news textarea.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage newsText() {
		pageUtility.sendDataToElement(newstxt, "Breaking");
		return this;
	}

	/**
	 * Clicks the save button to create/save the news entry.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage saveNews() {
		pageUtility.clickOnElement(savebtn);
		return this;
	}

	/**
	 * Clicks on the search button to display search options.
	 * Waits for the button to be clickable before performing the action.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage searchButton() {
		waitUtility.waitUntilClickable(driver, searchbtn);
		pageUtility.clickOnElement(searchbtn);
		return this;
	}

	/**
	 * Enters search text in the search field.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage searchText() {
		pageUtility.sendDataToElement(searchfield, "Breaking");
		return this;
	}

	/**
	 * Clicks the search news button to execute the news search.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage searchNews() {
		pageUtility.clickOnElement(searchnewsbtn);
		return this;
	}

	/**
	 * Clicks the home button to navigate back to the home page.
	 *
	 * @return HomePage instance after returning to home
	 */
	public HomePage returntoHome() {
		pageUtility.clickOnElement(homebtn);
		return new HomePage(driver);
	}

	/**
	 * Clicks the reset button to clear form fields.
	 * Uses method chaining to return the NewsPage instance.
	 *
	 * @return NewsPage instance for method chaining
	 */
	public NewsPage resetButton() {
		pageUtility.clickOnElement(resetbtn);
		return this;
	}

	/**
	 * Checks if the success alert message is displayed after news creation.
	 *
	 * @return true if the alert is displayed, false otherwise
	 */
	public boolean isAlertDisplayed() {
		return pageUtility.alertDisplay(alert);
	}
}
