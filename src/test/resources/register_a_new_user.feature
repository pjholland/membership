

  Feature: The visitor is able to register a new user

    Background:
      Given I am on the landing page

    Scenario: A new visitor to the site is able to register as a new member
      When The visitor selects the "new registration" page
      And The visitor completes a new member registration
      Then the new member is on the dashboard page



