package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

/**
 * BasePage is the parent class for all page objects in the POM framework.
 * It provides common initialization and utility access for all page classes.
 * 
 * @author QA Engineer
 * @version 1.0
 */
public class BasePage {

    /**
     * WebDriver instance for browser automation.
     */
    protected WebDriver driver;

    /**
     * WaitUtility instance for explicit wait operations.
     */
    protected WaitUtility waitUtility;

    /**
     * PageUtility instance for common page interactions.
     */
    protected PageUtility pageUtility;

    /**
     * Constructor for BasePage that initializes the WebDriver and utility instances.
     * PageFactory is initialized to support @FindBy annotations.
     *
     * @param driver The WebDriver instance to be used for browser automation
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtility = new WaitUtility();
        this.pageUtility = new PageUtility();
        PageFactory.initElements(driver, this);
    }
}
