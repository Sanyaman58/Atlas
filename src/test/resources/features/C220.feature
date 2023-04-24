@C220
Feature: C220

  @TestRail(220)
  Scenario: Verify that there is search field under each column on the result page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Results] sidebar button
    Then The [View Results] page is opened
    And Verify the search bar under each column