package com.membership.pageobjects;


import com.membership.Member;
import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgottenPasswordPage  extends BasePage {

    private By memberEmailEntry = By.id("member-email");
    private By sendResetLink = By.cssSelector("#forgot-password-form > button");

    public void requestEmailReset(){

        WebElement MemberEmailEntry = getDriver().findElement(memberEmailEntry);
        MemberEmailEntry.sendKeys(Member.buildTestMember().getEmail());

        WebElement SendResetLink = getDriver().findElement(sendResetLink);
        SendResetLink.click();
    }
}
