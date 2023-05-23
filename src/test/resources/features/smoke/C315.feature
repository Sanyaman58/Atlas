@C315 @Smoke
Feature: C315

  @TestRail(315)
  Scenario: Verify user is able to navigate to documents page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Document Repository] sidebar button
    Then The [Document Repository] page is opened
