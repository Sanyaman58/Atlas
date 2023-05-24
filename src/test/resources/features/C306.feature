@C306
Feature: C306

  @TestRail(306) @smoke
  Scenario: Verify user is able to navigate to all the grid
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    And Click on [Add Requirement] button
    And Fill all the required details on new Requirement popup