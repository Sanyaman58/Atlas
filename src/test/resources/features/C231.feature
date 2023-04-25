@C231
Feature: C231

  @TestRail(231)
  Scenario: Verify that there are search fields to Requirements Viewer section
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    And Verify that the search filed is present with the Requirement Viewer section
    