@C127

Feature: C127

  @TestRail(127)
  Scenario: Verify that user is able to see "Requirement Name" to the "Activity Log" output.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Select 4 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get requirement name of 1 records on [Research Results] page
    And Close [Research Results] window
    When Click on the [Activity Logs] button of the newly created job on the [View Results] page
    And The [Activity Logs] page is opened
    Then Enter requirement name saved on the [Research Results] page in the activity search on the [Activity Logs] page
    And Verify that logs are displayed on the [Activity Logs] page
    And Verify that log containing requirement name saved on the [Research Results] page in description text is displayed on the [Activity Logs] page

    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete newly created configuration with status "Submitted"


