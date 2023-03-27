@C146

Feature: C146

  @TestRail(146)
  Scenario: Verify that as an "System Admin" user I am able to Activate/Deactivate questions.
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
    And Click on the Activate Deactivate context menu button on the [Questionnaire Admin] page
    When Select "Deactive" value of the Activate Deactivate select near the 1 question on the [Questionnaire Admin] page
    And Click on the [Save] button on the [Questionnaire Admin] page
    Then The 1 question is deactivated
    When Right click on 1 question on the [Questionnaire Admin] page
    And Click on the Activate Deactivate context menu button on the [Questionnaire Admin] page
    When Select "Activate" value of the Activate Deactivate select near the 1 question on the [Questionnaire Admin] page
    And Click on the [Save] button on the [Questionnaire Admin] page
    Then The 1 question is activated
