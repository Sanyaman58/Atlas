@C112
Feature: C112

  @TestRail(112)
  Scenario: Verify the jurisdictions checkboxes position
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When Select "Test Pharma" client from the client dropdown
    Then Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    And Select "Georgia" state on the [Jurisdiction] page
    And Validate that the checkbox is to the left of the Jurisdiction text
    And Click the [Next] button on the [Jurisdiction] page
    And Click the [Next] button on the [Questionnaire] page
    And Verify the left position of Jurisdiction checkbox on save and submit configuration page