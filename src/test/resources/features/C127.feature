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
    Then Select "Adam Drugs" client from the client dropdown
    Then Select already created job by index 1 in the table on the [New Research] page
    When Click the [Copy From Research Job] button
    Then The [Jurisdiction] page is opened
    When Select "Colorado" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get table records on [Research Results] page

