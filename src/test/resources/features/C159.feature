@C159

Feature: C159

  @TestRail(159)
  Scenario: Verify that the user is able to create the tooltip for Surveillance Configuration against the questions
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    When Right click on 1 question on the [Questionnaire Admin] page
    And Click on the Add Comment context menu button on the [Questionnaire Admin] page
    And The [Add Comment] window is displayed on the [Questionnaire Admin] page
