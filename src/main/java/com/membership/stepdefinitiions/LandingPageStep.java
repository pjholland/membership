package com.membership.stepdefinitiions;

import com.membership.projectresouces.BasePage;
import com.membership.pageobjects.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LandingPageStep extends BasePage {

    private LandingPage landingPage;

    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page() throws Throwable {
        landingPage = new LandingPage();
        landingPage.open();
        wait(1);

    }

    @Given("^The visitor selects the \"([^\"]*)\" page$")
    public void the_visitor_selects_the_page(String option) throws Throwable {
        landingPage.selectLandingPageOption(option);
        wait(1);

    }
}
