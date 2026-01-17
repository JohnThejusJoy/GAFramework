package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;

/**
 * PageUtility provides common page interaction methods for Selenium WebDriver.
 * This utility class encapsulates reusable actions performed on web elements
 * such as clicking, typing, scrolling, and selecting dropdown options.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class PageUtility {

	/**
	 * Clicks on the specified WebElement.
	 * This method performs a standard click action on the provided element.
	 *
	 * @param element The WebElement to be clicked
	 */
	public void clickOnElement(WebElement element) {
		element.click();
	}

	/**
	 * Sends text data to the specified WebElement.
	 * This method is typically used to enter text into input fields, textareas,
	 * search boxes, and other text-accepting elements.
	 *
	 * @param element The WebElement to receive the text input
	 * @param text The text value to be sent to the element
	 */
	public void sendDataToElement(WebElement element, String text) {
		element.sendKeys(text);
	}

	/**
	 * Scrolls the page to bring the specified element into view.
	 * This method uses the Actions API to move the mouse cursor to the element,
	 * which automatically scrolls the page if the element is not visible.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param element The WebElement to scroll to and bring into view
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/**
	 * Clicks on an element using JavaScript.
	 * This method is useful for clicking on elements that may be hidden or
	 * not interactable through standard WebDriver click actions.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param locator The By locator to find the element to be clicked
	 */
	public void javaScriptClick(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * Clears all text from the specified WebElement.
	 * This method is useful for clearing text fields before entering new data.
	 *
	 * @param element The WebElement from which all text content will be cleared
	 */
	public void clearElementData(WebElement element) {
		element.clear();
	}

	/**
	 * Selects an option from a dropdown list by visible text.
	 * The visible text is retrieved from the Constant class (ADMINNAME).
	 *
	 * @param element The WebElement representing the select dropdown element
	 */
	public void selectData(WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(Constant.ADMINNAME);
	}

	/**
	 * Checks if the specified element is displayed on the page.
	 * This method verifies whether an element is visible to the user.
	 *
	 * @param element The WebElement to check for visibility
	 * @return true if the element is displayed, false otherwise
	 */
	public boolean alertDisplay(WebElement element) {
		return element.isDisplayed();
	}
}
