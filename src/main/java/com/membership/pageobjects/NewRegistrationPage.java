package com.membership.pageobjects;

import com.membership.Member;
import com.membership.projectresouces.BasePage;


public class NewRegistrationPage extends BasePage {

    public String phtest;

    String elementTitle = "member-title";
    String elementFirstName = "member-first-name";
    String elementLastName = "member-last-name";
    String elementDay = "member-day-of-birth";
    String elementMonth = "member-month-of-birth";
    String elementYear = "member-year-of-birth";
    String elementPostCode = "postcode";
    String elementFindAddressButton = "find-address-current";
    String elementAddressSearchResults = "#postcode-search-results-placeholder > ul > li > span";
    String elementEmail = "member-email";
    String elementConfirmEmail = "member-confirm-email";
    String elementPassword = "member-password";
    String elementConfirmPassword = "member-confirm-password";
    String elementContinuetopayment = "register-button";



    public void fillInNewRegistrationPage() throws Exception {

        Member member = Member.buildTestMember();


        selectFromDropDownList(elementTitle, "Mr");
        type(Locators.id, elementFirstName, member.getFirstName());
        type(Locators.id, elementLastName, member.getLastName());
        type(Locators.id, elementDay, member.getDay());
        type(Locators.id, elementMonth, member.getMonth());
        type(Locators.id, elementYear,member.getYear());
        type(Locators.id, elementPostCode, member.getPostCode());
        click(Locators.id, elementFindAddressButton);
        waitForElementDisplayed(Locators.id, elementFindAddressButton);
        click(Locators.css, elementAddressSearchResults);
        wait(1);
        type(Locators.id, elementEmail, member.getEmail());
        wait(3);
        type(Locators.id, elementConfirmEmail, member.getConfirmEmail());
        type(Locators.id, elementPassword, member.getPassword());
        type(Locators.id, elementConfirmPassword, member.getConfirmPassword());
        click(Locators.id, elementContinuetopayment);

    }


}

