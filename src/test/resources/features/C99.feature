@C99
Feature: C99

  @TestRail(99)
  Scenario: Verify the Login page functionality
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    When Enter password "Test" on login page
    When Click the [Login] button
    And Clear Password filed
    Then Enter login "Test" on login page
    When Click the [Login] button
    And Clear Email field
    And Enter password "Test" on login page
    And Enter login "Test" on login page
    When Click the [Login] button
    Then Validate that the "Invalid Username or Password . Please try again" error message displayed
    And CLick the [Cancel] button
    And Verify empty Email and Password field
    When Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Log out from Atlas
    Then The [Login] page is opened
