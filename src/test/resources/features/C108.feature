@C108

Feature: C108

  @TestRail(108)
  Scenario: Admin Homepage
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on the [Requirements] button on admin
    Then The [Research Admin] page is opened
    When Click on the [Research] sidebar button on admin
    Then The [Research Admin] page is opened
    When Click on the [Research] sidebar button on admin
    And Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    When Click on the [Research] sidebar button on admin
    And Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    When Click on the [Requirements View] sidebar button on admin
    Then The [Research Admin] page is opened
    When Click on the [Notifications] sidebar button on admin
    Then The [Research Notification] page is opened
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    When Click on the [Questionnaire Versions] sidebar button on admin
    Then The [Questionnaire Versions] page is opened
