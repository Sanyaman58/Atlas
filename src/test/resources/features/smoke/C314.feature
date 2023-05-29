@C314 @Smoke
Feature: C314

  @TestRail(314)
  Scenario: Verify user is able to edit and save the task
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Task Manager] button on Atlas
    Then The [Task Manager] page is opened
    When Click on Go to Task button of the 1 record on the [Task Manager] page
    And Double click on 1 task on the task popup on the [Task Manager] page
    Then Select "Complete" task status on the Edit Task window on the [Task Manager] page
    And Click on Save task button on the EditTask window on the [Task Manager] page
    And Click on OK button
    Then Verify that status of the 1 task is changed to "Complete" on the task popup on the [Task Manager] page