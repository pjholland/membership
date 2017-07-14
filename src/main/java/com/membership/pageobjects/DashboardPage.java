package com.membership.pageobjects;


import com.membership.Member;
import com.membership.projectresouces.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private By changeYourDetails = By.id("view-member-details-button");
    private By signOutLink = By.cssSelector("body > header > div.right.float-right > div > form > div > input");

    public void selectChangeYourDetails(){

        WebElement SignIn = getDriver().findElement(changeYourDetails);
        SignIn.click();
    }

    public void signMemberOut(){

        WebElement SignOutLink = getDriver().findElement(signOutLink);
        SignOutLink.click();

    }

    public void checkMemberDetails(){
        checkTextPresentOnPage(Member.buildTestMember().getPassword());

    }
}