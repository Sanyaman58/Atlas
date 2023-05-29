@C304
Feature: C304

  @TestRail(304) @smoke
  Scenario: Verify successful login flow
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    When Enter login "nikita.danilevskiy@pharma.solutions" on login page
    When Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
