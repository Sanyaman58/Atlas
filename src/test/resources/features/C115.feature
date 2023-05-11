@C115 @Test
Feature: C115

  @TestRail(115)
  Scenario: UI/UX Internal User Surveillance Setup
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Audit Logs] sidebar button
    Then The [Audit Logs] page is opened
    Then The following labels are displayed in the [Audit Logs] table
      | Type          |
      | Time          |
      | Username      |
      | Client Name   |
      | Company Name  |
      | Facility Name |
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "AB Test" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AB Test" client from the client dropdown
    Then Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Click the [Next] button on the [Jurisdiction] page
    When Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    And Click on the [Save Job] button
    And The [Configuration] page is opened
    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    And Click on the [Audit Logs] sidebar button on Lighthouse
    Then The [Audit Logs] page is opened
    Then Click on the "Time" label on the [Audit Logs] page
    Then Click on the "Time" label on the [Audit Logs] page
    When Get audit logs from the table
    Then Verify that new log with "New Facility" type is in the list
    And Reload the browser
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "AB Test" client from the client dropdown
    And Delete newly created configuration with status "Saved"
    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    And Click on the [Audit Logs] sidebar button on Lighthouse
    When Get audit logs from the table
    Then Verify that new log with "Delete Result" type is in the list
