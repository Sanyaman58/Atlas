@C103
Feature: C103

  @TestRail(103)
  Scenario: Verify the "Jurisdictions" page functionality (Step 2)
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify the [Surveillance Setup] section
    Then Validate fields on the [Surveillance Setup] page
    And Reload the browser
    Then Select "AB Test" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AB Test" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    When Click surveillance setup [Next] button
    Then The [Jurisdiction] page is opened
    And Verify labels on [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    When Click on [Clear All] button
    Then Verify all checkboxes are not selected
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
