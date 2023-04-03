@C107
Feature: C107

  @TestRail(107)
  Scenario: Verify the surveillance deletion functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When Click on the delete button of any displayed configuration with status "Completed" on the [Configuration] page
    Then Verify that alert message with "The selected research will be deleted and cannot be undone. Are you sure want to delete?" message is displayed
    And Click on Yes Delete button on the alert window
    Then Verify that second alert message with "Would you also like to delete all results associated with these Answers?" message is displayed
    And Click on Yes Delete button on the alert window for the second time
    Then Verify that alert message about submitted job deletion is displayed
    And Click on Yes Delete button on the alert window for the third time
    And Verify that the configuration is deleted on the [Configuration] page
