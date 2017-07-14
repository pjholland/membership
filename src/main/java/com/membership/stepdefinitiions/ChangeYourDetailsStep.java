package com.membership.stepdefinitiions;


import com.membership.pageobjects.DashboardPage;
import com.membership.pageobjects.SignInPage;
import com.membership.projectresouces.BasePage;
import cucumber.api.java.en.Then;

public class ChangeYourDetailsStep extends BasePage {

    DashboardPage dashboardPage;
    SignInPage signInPage;

    @Then("^the member can view their details$")
    public void theMemberCanViewTheirDetails() throws Throwable {
        dashboardPage = new DashboardPage();
        signInPage = new SignInPage();
        signInPage.memberSignIn();
        dashboardPage.selectChangeYourDetails();
        // add enter DOB method
        dashboardPage.checkMemberDetails();





    }
}
