package com.membership.pageobjects;

import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    private By signIn = By.linkText("Go to /sign-in");
    private By register = By.linkText("Go to /register");
    private By newRegistration = By.linkText("Go to /new-registration");


    public void open() {
        getDriver().get("https://Member-portal.qa.meaningfulplatform.co.uk/");
    }

    public void selectLandingPageOption(String option) throws Throwable {
        if (option.equals("log on")) {
            WebElement SignIn = getDriver().findElement(signIn);
            SignIn.click();
        } else if (option.equals("register")) {
            WebElement Register = getDriver().findElement(register);
            Register.click();
        } else if (option.equals("new registration")) {
            WebElement Register = getDriver().findElement(newRegistration);
            Register.click();
        }

    }


}
