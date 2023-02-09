@C114

Feature: C114

  @TestRail(114)
  Scenario: UI/UX Internal User Surveillance Setup
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When The client dropdown is visible and clickable
    Then Select "Test" client from the client dropdown
#    When Create a new surveillance
    Then Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Save Job] button
    Then The [Configuration] page is opened
    When Select "Test" client from the client dropdown
    Then Newly created job with status "Saved" is displayed in the table on the [New Research] page
    When Select "Adam Drugs" client from the client dropdown
    Then Newly created job with status "Saved" is not displayed in the table on the [New Research] page
    When Select "Test" client from the client dropdown
    And Delete newly created configuration with status "Saved"
    And Verify that the configuration is deleted on the [Configuration] page
    When Log out from Lighthouse
    When Open Atlas
    Then Enter login "momludilte@gufum.com" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When The client dropdown is not visible and clickable