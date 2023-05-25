@C312
Feature: C312

  @TestRail(312) @smoke
  Scenario: Verify user is able to assign the task to the same user
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Task Management] button on Atlas
    Then The [Tasks] page is opened
    And Select any column and click on [Go to Task] button
    And Click on [Add Task] button
    Then Select "Addition of CMO" type from type dropdown list of Add Task popup
    Then Select "Board Pending" Task status from task status dropdown list of Add Task popup
    Then Assign the task to the same user from which task is created
    And Click on Add task popup save button
