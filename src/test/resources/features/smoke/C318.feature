@C318 @Smoke
Feature: C318

  @TestRail(318) @smoke
  Scenario: Verify user is able to navigate to Document notifications page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Notifications] atlas collapse button
    And Click on the [Documents] sidebar button under the [Notifications] section
    Then The [Documents Notifications] page is opened