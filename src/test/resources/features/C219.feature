@C219
Feature: C219

  @TestRail(219)
  Scenario: Verify that there is category column to the intelligence result
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Results] sidebar button
    Then The [View Results] page is opened
    And Click on result page view icon
    And Verify the [Category] column on Knowledge Results page
