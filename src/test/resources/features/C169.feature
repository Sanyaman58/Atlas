@C169

Feature: C169

  @TestRail(169)
  Scenario: Verify that the show Results progress status when in Results Pending Status
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    Then Select "Pharma Solutions USA" client from the client dropdown
    When Validate fields on the [Surveillance Setup] page
    When Select 5 company name
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
    And Verify the [Progress Bar] against the newly created job on the screen
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete newly created configuration with status "Submitted"

