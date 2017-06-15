package com.membership.pageobjects;

import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentPage extends BasePage {

    private By CARD_NUMBER_IFRAME = By.className("gw-proxy-number");
    private By CARD_NUMBER = By.xpath("//input[@placeholder='Enter card number']");
    private By CARD_EXPIRY_DATE_MONTH = By.id("expiry-month");
    private By CARD_EXPIRY_DATE_YEAR = By.id("expiry-year");
    private By CARD_SECURITY_CODE_IFRAME = By.className("gw-proxy-securityCode");
    private By CARD_SECURITY_CODE = By.xpath("//input[@placeholder='CVV']");
    private By SUBMIT_PAYMENT_BUTTON = By.id("submit-payment-form");

    public void enterTextIntoCardNumberField(WebDriver getDriver) {
        getDriver.switchTo().frame(getDriver.findElement(CARD_NUMBER_IFRAME));
        getDriver.findElement(CARD_NUMBER).click();
        getDriver.findElement(CARD_NUMBER).sendKeys("5301250070000050 ");
        getDriver.switchTo().defaultContent();
    }

    public void enterTextIntoExpiryMonthField(WebDriver getDriver) {
        getDriver.findElement(CARD_EXPIRY_DATE_MONTH)
                .sendKeys("05");
    }

    public void enterTextIntoExpiryYearField(WebDriver getDriver) {
        getDriver.findElement(CARD_EXPIRY_DATE_YEAR)
                .sendKeys("17");
    }

    public void enterTextIntoSecurityCodeField(WebDriver getDriver) {
        getDriver.switchTo().frame(getDriver.findElement(CARD_SECURITY_CODE_IFRAME));
        getDriver.findElement(CARD_SECURITY_CODE).click();
        getDriver.findElement(CARD_SECURITY_CODE).sendKeys("123");
        getDriver.switchTo().defaultContent();
        getDriver.findElement(SUBMIT_PAYMENT_BUTTON).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
