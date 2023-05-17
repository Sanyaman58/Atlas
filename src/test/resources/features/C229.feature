@C229

Feature: C229

  @TestRail(229)
  Scenario: Verify that research internal user is only able to view the questionnaire version
    When Open Atlas
    Then Enter login "nirdupalma@gufum.com" on login page
    And Enter password "Testing2022%%" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Intelligence Admin] sidebar collapse button
    When Click on the [Questionnaire Versions] sidebar button
    #Then The [Questionnaire Versions] page is opened
    #Then The Activate questionnaire version button is not visible on the [Questionnaire Versions] page
    #And The View questionnaire version button is visible on the [Questionnaire Versions] page
