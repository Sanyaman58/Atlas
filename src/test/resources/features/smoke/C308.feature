@C308
Feature: C308

  @TestRail(308) @smoke
  Scenario: Verify user is able to create a new activity
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Activity Tracklog] button on Atlas
    Then The [Avtivity] page is opened
    And Select any column and click on [Add Activity] button
    Then Select "Initial" requirement from requirement activity dropdown list
    And Enter Activity start date
    And Click Add Activity popup [Next] button
    Then Select "Addition of CMO" type from add type dropdown list
    Then Select "Board Pending" task status from task status dropdown list
    Then Select "Nikita Danilevskiy" from assignee dropdown list
    And Click on Add Activity popup save button