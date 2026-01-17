package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * WaitUtility provides explicit wait conditions for Selenium WebDriver.
 * This utility class encapsulates various wait strategies to ensure
 * elements are in the expected state before performing actions.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class WaitUtility {

	/**
	 * Default timeout duration in seconds for explicit waits.
	 */
	public static final int EXPLICITWAIT = 5;

	/**
	 * Waits until the specified element is clickable.
	 * This wait condition ensures that an element is both visible and enabled
	 * before attempting to click on it.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param element The WebElement to wait for until it becomes clickable
	 */
	public void waitUntilClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Waits until an alert is present on the page.
	 * This wait condition is useful when expecting JavaScript alert dialogs
	 * to appear as a result of user interactions.
	 *
	 * @param driver The WebDriver instance used for automation
	 */
	public void waitUntilAlertDisplayed(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * Waits until the logout element is displayed on the page.
	 * This wait condition specifically checks for the presence of the logout button
	 * element, typically used after successful login.
	 *
	 * @param driver The WebDriver instance used for automation
	 */
	public void waitUntilLogoutIsDisplayed(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a i.fa-power-off")));
	}

	/**
	 * Waits until the specified text is present in the given element.
	 * This wait condition is useful for verifying that dynamic content
	 * has loaded or been updated in an element.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param element The WebElement to check for the presence of text
	 * @param text The text value expected to be present in the element
	 */
	public void waitUntilTextIsDisplayed(WebDriver driver, WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	/**
	 * Waits until the specified element is selected.
	 * This wait condition is typically used with checkbox, radio button,
	 * or select list elements to ensure they are in a selected state.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param element The WebElement to wait for until it becomes selected
	 */
	public void waitUntilElementIsSelected(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	/**
	 * Waits until the specified element is visible on the page.
	 * This wait condition ensures that an element is present in the DOM
	 * and visible to the user before performing any actions.
	 *
	 * @param driver The WebDriver instance used for automation
	 * @param element The WebElement to wait for until it becomes visible
	 */
	public void waitUntilElementIsVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
