package com.membership.projectresouces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public enum Locators {
        xpath, id, name, classname, paritallinktext, linktext, tagname, css,
    }

    protected WebDriver getDriver() {
        return webDriverSingleton.getInstance();

    }

    /////////////////////////////////////////
    //waiting functionality
    /////////////////////////////////////////

    //a method for allowing selenium to pause for a set amount of time
    protected void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public void wait(double seconds) throws InterruptedException {
        Thread.sleep(Double.doubleToLongBits(seconds * 1000));
    }

    //a method for waiting until an element is displayed
    protected void waitForElementDisplayed(Locators locator, String element) throws Exception {
        waitForElementDisplayed(getWebElement(locator, element), 5);
    }

    public void waitForElementDisplayed(Locators locator, String element, int seconds) throws Exception {
        waitForElementDisplayed(getWebElement(locator, element), seconds);
    }

    public void waitForElementDisplayed(WebElement element) throws Exception {
        waitForElementDisplayed(element, 5);
    }

    private void waitForElementDisplayed(WebElement element, int seconds) throws Exception {
        //wait for up to XX seconds for our error message
        long end = System.currentTimeMillis() + (seconds * 1000);
        while (System.currentTimeMillis() < end) {
            // If results have been returned, the results are displayed in a drop down.
            if (element.isDisplayed()) break;
        }
    }

    //////////////////////////////////////
    //checking element functionality
    //////////////////////////////////////

    //a method for checking id an element is displayed
    public void checkElementDisplayed(Locators locator, String element) throws Exception {
        checkElementDisplayed(getWebElement(locator, element));
    }

    private void checkElementDisplayed(WebElement element) throws Exception {

    }

    /////////////////////////////////////
    //selenium actions functionality
    /////////////////////////////////////

    //our generic selenium click functionality implemented
    protected void click(Locators locator, String element) throws Exception {
        click(getWebElement(locator, element));
    }

    private void click(WebElement element) {
        Actions selAction = new Actions(getDriver());
        selAction.click(element).perform();
    }

    //a method to simulate the mouse hovering over an element
    public void hover(Locators locator, String element) throws Exception {
        hover(getWebElement(locator, element));
    }

    private void hover(WebElement element) throws Exception {
        Actions selAction = new Actions(getDriver());
        selAction.moveToElement(element).perform();
    }

    //our generic selenium type functionality
    protected void type(Locators locator, String element, String text) throws Exception {
        type(getWebElement(locator, element), text);
    }

    private void type(WebElement element, String text) {
        Actions selAction = new Actions(getDriver());
        selAction.sendKeys(element, text).perform();
    }

    // if this method is used then the element type in the page object be should String and not WebDriver By
    protected void selectFromDropDownList(String dropDownId, String dropDownRowName) {
        Select dropdown = new Select(getDriver().findElement(By.id(dropDownId)));
        dropdown.selectByVisibleText(dropDownRowName);
    }


    /////////////////////////////////////
    //Other Generic Tests
    ////////////////////////////////////

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void checkTextPresentOnPage(String text) {
        getDriver().getPageSource().compareTo(text);
    }


    ////////////////////////////////////
    //extra base selenium functionality
    ////////////////////////////////////

    //a method to grab the web element using selenium webdriver
    private WebElement getWebElement(Locators locator, String element) throws Exception {
        By byElement;
        switch (locator) {        //determine which locator item we are interested in
            case xpath: {
                byElement = By.xpath(element);
                break;
            }
            case css: {
                byElement = By.cssSelector(element);
                break;
            }
            case id: {
                byElement = By.id(element);
                break;
            }
            case name: {
                byElement = By.name(element);
                break;
            }
            case classname: {
                byElement = By.className(element);
                break;
            }
            case linktext: {
                byElement = By.linkText(element);
                break;
            }
            case paritallinktext: {
                byElement = By.partialLinkText(element);
                break;
            }
            case tagname: {
                byElement = By.tagName(element);
                break;
            }
            default: {
                throw new Exception();
            }
        }
        return getDriver().findElement(byElement);    //return our query

    }


}
