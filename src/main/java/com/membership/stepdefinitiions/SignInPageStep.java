package com.membership.stepdefinitiions;

import com.membership.pageobjects.*;
import com.membership.projectresouces.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class SignInPageStep extends BasePage {

    private LandingPage landingPage;
    private DashboardPage dashboardPage;
    private SignInPage signInPage;
    private ForgottenPasswordPage forgottenPasswordPage;
    private ResetPassword resetPassword;


    @Given("^The visitor selects the log on page$")
    public void the_visitor_selects_the_log_on_page() throws Throwable {


    }


    @When("^the member requests a forgotten password email$")
    public void the_member_requests_a_forgotten_password_email() throws Throwable {
        dashboardPage = new DashboardPage();
        dashboardPage.signMemberOut();
        landingPage = new LandingPage();
        landingPage.selectLandingPageOption("sign in");
        signInPage = new SignInPage();
        signInPage.clickForgottenPasswordLink();
        forgottenPasswordPage = new ForgottenPasswordPage();
        forgottenPasswordPage.requestEmailReset();
        getDriver().get("https://www.mailinator.com/");
        resetPassword = new ResetPassword();
        resetPassword.getMailinatorReset();




    }

}
