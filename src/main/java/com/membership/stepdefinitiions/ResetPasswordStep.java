package com.membership.stepdefinitiions;

import com.membership.pageobjects.ResetPassword;
import com.membership.projectresouces.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ResetPasswordStep extends BasePage {

    private ResetPassword resetPassword;

    @When("^the member resets their password$")
    public void the_member_resets_their_password() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("^the member is able to log on using the new password$")
    public void theMemberIsAbleToLogOnUsingTheNewPassword() throws Throwable {
        resetPassword.resetPassword(getDriver());
    }
}
