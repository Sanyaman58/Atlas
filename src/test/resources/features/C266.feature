@C266
Feature: C266

  @TestRail(266)
  Scenario: Change name labels for Intelligence module
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Intelligence] sidebar button
    Then Verify Intelligence dropdown options
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify the header label on Configuration setup page
    And Verify the header text on the right section
    Then Select "AB Test" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AB Test" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    When Click surveillance setup [Next] button
    Then The [Jurisdiction] page is opened
    And Verify the Configuration page header text