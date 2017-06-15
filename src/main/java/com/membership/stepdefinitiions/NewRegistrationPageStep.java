package com.membership.stepdefinitiions;

import com.membership.pageobjects.PaymentPage;
import com.membership.projectresouces.BasePage;
import com.membership.pageobjects.NewRegistrationPage;
import cucumber.api.java.en.When;



public class NewRegistrationPageStep extends BasePage {

    NewRegistrationPage newRegistrationPage;
    PaymentPage paymentPage;

    @When("^The visitor completes a new member registration$")
    public void the_visitor_complete_a_new_member_registration() throws Throwable {
        newRegistrationPage = new NewRegistrationPage();
        newRegistrationPage.fillInNewRegistrationPage();
        paymentPage = new PaymentPage();
        paymentPage.enterTextIntoCardNumberField(getDriver());
        paymentPage.enterTextIntoExpiryMonthField(getDriver());
        paymentPage.enterTextIntoExpiryYearField(getDriver());
        paymentPage.enterTextIntoSecurityCodeField(getDriver());

    }
}
