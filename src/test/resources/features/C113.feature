@C113
Feature: C113

  @TestRail(113)
  Scenario: Research Permissions
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click the [Permissions] button on the left sidebar
    Then Verify [Permissions] page is opened
    And Disable the [Delete Facility] checkbox for [System Admin]
    And Click on [Update Permission] button
    And Logout from the application
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify that the [Delete] action button is diabled
    When Click the [Permissions] button on the left sidebar
    Then Verify [Permissions] page is opened
    And Enable the [Delete Facility] checkbox for [System Admin]
    And Click on [Update Permission] button
    And Logout from the application
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify Delete button is enabled and click on it
