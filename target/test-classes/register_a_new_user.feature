Feature: The visitor is able to register a new user

  Background:
    Given I am on the landing page

  Scenario: A new visitor to the site is able to register as a new member
    When The visitor selects the "new registration" page
    And The visitor completes a new member registration
    Then the new member is on the dashboard page

  Scenario: A new visitor is able to register using a temp card
    When The visitor selects the "registration" page
    #And The visitor has a temp card

  Scenario: A new visitor is able to regiater as a colleague
    When The visitor selects the "colleague registration" page
    #And the visitor completes a new colleague registraion





