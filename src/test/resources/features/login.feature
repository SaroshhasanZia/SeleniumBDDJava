@Login

Feature: To Test the login functionality
  Scenario: Test the login with valid credentials
    Given User is on the login screen
    When User enters username and password
    And Clicks on the login button
    Then user is navigated to homepage

