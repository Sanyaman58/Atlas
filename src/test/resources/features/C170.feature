@C170
Feature: C170

  @TestRail(170)
  Scenario: Verify that user is able to see EUI states on the configuration.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When Select "AB Test" client from the client dropdown
    And Delete job from the table if exists
    When Select "AB Test" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    And EUI states radio buttons are visible
