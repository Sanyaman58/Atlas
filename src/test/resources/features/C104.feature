@C104
Feature: C104

  @TestRail(104)
  Scenario: Verify the "Questionnaire" page functionality (Step 3)
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    And Select "Pharma Solutions USA" client from the client dropdown
    And Select 5 company name
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
    And Verify child questions ae unclickable as parent questions are not clicked
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
