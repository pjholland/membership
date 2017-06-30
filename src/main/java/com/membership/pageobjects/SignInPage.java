package com.membership.pageobjects;

import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SignInPage extends BasePage{

    private By forgottenPassword = By.id("forgotten-password-button");

    public void clickForgottenPasswordLink(){

        WebElement SignIn = getDriver().findElement(forgottenPassword);
        SignIn.click();

    }



}
