@SubSections
Feature: Subsection Features


  @StartUps
  Scenario: User navigates to: Start Ups section
    Given User is at homepage
    When User clicks on StartUp
    Then User is navigated to StartUp page
    And User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message


  @Enterprise
  Scenario: User navigates to: Enterprise section
    Given User is at homepage
    When User clicks on Enterprise
    Then User is navigated to Enterprise page
    And User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message


  @VCFirms
  Scenario: User navigates to: VC Firms section
    Given User is at homepage
    When User clicks on VC Firms
    Then User is navigated to VC Firm page
    And User is navigated to the form
    And User fills the form
    And User clicks on the submit button
    Then User gets success message