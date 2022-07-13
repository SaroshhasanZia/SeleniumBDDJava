@HomePage
Feature: Homepage Features

  @HomePage
  Scenario: Test User navigates to the Homepage when browsing the URL
    Given User browse the URL
    Then User is navigated to homepage




  @ScheduleConsultation
  Scenario: User Clicks on : Schedule a consultation button
#    Given User is at the homepage
    When User clicks on the Schedule a consultation button
    Then User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message


  @MoreAboutUs
  Scenario: User Clicks on : More About Us button
#    Given User is at the homepage
    When User clicks on More About Us button
    Then User is navigated to the About Us page
    And User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message


  @CaseStudy
  Scenario: User Clicks on : Case Study button
    Given User is at the homepage
    When User clicks on Case Study button
    Then User is navigated to the Case Study page
    And User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message


  @LanguageChange
  Scenario: User Change the language to Dutch
    Given User is at the homepage
    When User clicks on the Language dropdown
    And User select Dutch language
    Then User gets the content in Dutch Language


 @PrivacyPolicy
  Scenario: User Clicks on : Privacy Policy
    Given User is at the homepage
    When User Navigates to the bottom of the page
    And User click on Privacy Policy
    Then User Navigates to Privay policy page


  @ContactUs
  Scenario: User Clicks on : Contact Us button
#    Given User is at the homepage
    When User clicks on the Contact Us button
    Then User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message






