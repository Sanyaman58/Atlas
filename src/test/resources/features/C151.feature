@C151

Feature: C151

  @TestRail(151)
  Scenario: Verify the status of the configuration with the apostrophe in its company, facility and client names on the "Results" page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Sumeet's Sandbox" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Sumeet's Sandbox" client from the client dropdown
    When Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Alabama" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page

    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "Sumeet's Sandbox" client from the client dropdown
    And Delete newly created configuration with status "Submitted"
