package com.membership.pageobjects;


import com.membership.Member;
import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ResetPassword extends BasePage {

    private By mailinatorInbox = By.id("inboxfield");
    private By goToMailinatorInBox = By.cssSelector("div.input-group > span > button");
    private By mailinatorResetPasswordLink = By.className("outermail");
    private By emailBodyResetLink = By.cssSelector("body > div > table:nth-child(3) > tbody > tr:nth-child(5) > td > table > tbody > tr:nth-child(2) > td");
    private By newPasswordEntryBox = By.cssSelector("#member-new-password");
    private By confirmnewPasswordEntryBox = By.id("member-confirm-password");
    private By setNewPasswordButton = By.cssSelector("#reset-password-form > button");


    public void getMailinatorReset() throws InterruptedException {

        WebElement MailinatorInbox = getDriver().findElement(mailinatorInbox);
        MailinatorInbox.sendKeys((Member.buildTestMember().getEmail()));

        Thread.sleep(1000);

        WebElement GoToMailinatorInBox = getDriver().findElement(goToMailinatorInBox);
        GoToMailinatorInBox.click();

        Thread.sleep(1000);

        WebElement MailinatorResetPasswordLink = getDriver().findElement(mailinatorResetPasswordLink);
        MailinatorResetPasswordLink.click();

        Thread.sleep(2000);

        checkTextPresentOnPage("Reset password");



    }



    public void switchToResetIframe(WebDriver getDriver) throws InterruptedException {

        getDriver.switchTo().frame("publicshowmaildivcontent");

        WebElement EmailBodyResetLink = getDriver().findElement(emailBodyResetLink);
        EmailBodyResetLink.click();

        Thread.sleep(1000);

        getDriver.switchTo().defaultContent();

        Thread.sleep(1000);
    }

   public void resetPassword(WebDriver getDriver) throws InterruptedException {


       Thread.sleep(3000);

       ArrayList<String> tabs2 = new ArrayList<String> (getDriver.getWindowHandles());
       getDriver.switchTo().window(tabs2.get(0));
       getDriver.close();
       getDriver.switchTo().window(tabs2.get(1));


       checkTextPresentOnPage("You cannot use a password you've used before.");

        WebElement NewPasswordEntryBox = getDriver().findElement(newPasswordEntryBox);
        NewPasswordEntryBox.sendKeys("N4wPassw0rd");

       Thread.sleep(1000);

       WebElement ConfirmnewPasswordEntryBox = getDriver().findElement(confirmnewPasswordEntryBox);
       ConfirmnewPasswordEntryBox.sendKeys("N4wPassw0rd");

       WebElement SetNewPasswordButton = getDriver().findElement(setNewPasswordButton);
       SetNewPasswordButton.click();

       Thread.sleep(5000);


   }





}


