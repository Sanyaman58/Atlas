@C108
Feature: C108

  @TestRail(108)
  Scenario: Admin Homepage
    When Open Atlas
    Then Enter login "yepsizigna@gufum.com" on login page
    And Enter password "Testing2022%%" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    And Click on the [Requirements] button on admin
    Then The [Requirements Admin] page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    And Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    And Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    And Reload the browser
    And Verify the child buttons under [Intelligence Admin] section
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on [Audit Logs] sidebar button
    Then The [Logs] page is opened
    When Click on [Requirements View] sidebar button
    Then The [Requirements Admin] is opened
    When Click on [Version Requirements] sidebar button
    Then The [Version Requirements] page is opened
    When Click on [Active Requirements] sidebar button
    Then The [Active Requirements] page is opened
    When Click on [Notifications] sidebar button
    Then The [Notifications] page is opened
    When Click on [EUI Versions] sidebar button
    Then The [EUI Version] page is opened
    When Click on [Questionnaire Versions] sidebar button
    Then The [Questionnaire Versions] page is opened
    When Click on [Permissions] sidebar button
    Then The [Permissions] page is opened
