package com.membership.pageobjects;

import com.membership.Member;
import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SignInPage extends BasePage{

    private By forgottenPassword = By.id("forgotten-password-button");
    private By signInPageEmailInput = By.id("member-email");
    private By signInPagePasswordInput = By.id("member-password");
    private By signInPageSignInButton = By.cssSelector("body > main > div > div > div > div > form > div:nth-child(3) > button");

    public void clickForgottenPasswordLink(){

        WebElement SignIn = getDriver().findElement(forgottenPassword);
        SignIn.click();

    }

    public void memberSignIn(){

        WebElement SignInPageEmailInput = getDriver().findElement(signInPageEmailInput);
        SignInPageEmailInput.sendKeys((Member.buildTestMember().getEmail()));

        WebElement SignInPagePasswordInput = getDriver().findElement(signInPagePasswordInput);
        SignInPagePasswordInput.sendKeys("N4wPassw0rd");

        WebElement SignInPageSignInButton = getDriver().findElement(signInPageSignInButton);
        SignInPageSignInButton.click();

    }



}
