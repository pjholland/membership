Feature: Member actions

  Background:
    Given I am on the landing page

  @current
  Scenario:  A new member is able to reset their password
    And The visitor selects the "new registration" page
    And The visitor completes a new member registration
    When the member requests a forgotten password email
    Then the member can view their details