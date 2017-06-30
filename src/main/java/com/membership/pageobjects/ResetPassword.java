package com.membership.pageobjects;


import com.membership.Member;
import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResetPassword extends BasePage {

    private By mailinatorInbox = By.id("inboxfield");
    private By goToMailinatorInBox = By.cssSelector("div.input-group > span > button");
    private By mailinatorResetPasswordLink = By.className("outermail");
    //private By emailBodyResetLink = By.xpath("//a[contains(@href, 'router')]");
    private By emailBodyResetLink = By.xpath("//a[text()='Reset password']/@href");


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

//        WebElement link = getDriver().findElement(By.xpath("//a[contains(@href, 'router')]"));
//        String linkLocatin = link.getCssValue("href");
//        System.out.println("Link Location "+linkLocatin);

        Thread.sleep(5000);

        WebElement EmailBodyResetLink = getDriver().findElement(emailBodyResetLink);
        EmailBodyResetLink.click();

        Thread.sleep(1000);

    }
}
