@C107
Feature: C107

  @TestRail(107)
  Scenario: Verify the surveillance deletion functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
     When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "AB Test" client from the client dropdown
    When Validate fields on the [Surveillance Setup] page
    And Delete job from the table if exists
    Then Select "AB Test" client from the client dropdown
    When Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
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
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    Then Click on the [Configuration] sidebar button on Lighthouse
    When Click on the delete button of any displayed configuration with status "Completed" on the [Configuration] page
    Then Verify that alert message with "The selected research will be deleted and cannot be undone. Are you sure want to delete?" message is displayed
    And Click on Yes Delete button on the alert window
    Then Verify that second alert message with "Would you also like to delete all results associated with these Answers?" message is displayed
    And Click on Yes Delete button on the alert window for the second time
    Then Verify that alert message about submitted job deletion is displayed
    And Click on Yes Delete button on the alert window for the third time
    And Verify that the configuration is deleted on the [Configuration] page
