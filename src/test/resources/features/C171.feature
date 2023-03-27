@C171
Feature: C171

  @TestRail(171)
  Scenario: Verify that user is able to see show "All" filter option in Activity Logs screen
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on [Surveillance Intelligence] dropdown button and verify options
    Then Click on [Results] dropdown button
    And The [View Results] page is opened
    When Click on [Activity Logs] option of the line item
    Then Verify [Activity Logs] screen and default filter is set to [All]
