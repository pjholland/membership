package com.membership.pageobjects;

import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangeYourDetailsPage extends BasePage {

    private By changeYourPassword = By.id("edit-password-link");

    private void selectChangeYourDetails() {

        WebElement SignIn = getDriver().findElement(changeYourPassword);
        SignIn.click();

    }
}
