@C105
Feature: C105

  @TestRail(105)
  Scenario: Verify the "Save/Submit Configuration" page functionality (Step 4)
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    Then Select "AB Test" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AB Test" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    When Click surveillance setup [Next] button
    Then The [Jurisdiction] page is opened
    And Reload the browser
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Validate the [Questionnaire] page elements
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Change Questionnaire] button
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    And Validate the lables on the [SaveSubmit Job] page
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "AB Test" client from the client dropdown
    And Delete newly created configuration with status "Submitted"
