@C160

Feature: C160

  @TestRail(160)
  Scenario: Verify that user is able to see the results of the configured record.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Results] sidebar button
    Then The [View Results] page is opened
    When Click on the [View] button of the 1 job on the [View Results] page
    Then The [Research Results] page is opened