@C108

Feature: C108

  Scenario: Admin Homepage
    When Open Lighthouse Admin
    Then Enter login "research.admin@pharma.solutions" on login admin page
    Then Enter password "shanky@1234" on login admin page
    When Click the [Login] button on login admin page
    Then The [Research Admin] page is opened
    When Click on the [Requirements] button on admin
    Then The [Requirements Admin] page is opened
    When Click on the [Research] sidebar button on admin
    Then The [Research Admin] page is opened
    When Click on the [Research] sidebar button on admin
    And Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    When Click on the [Research] sidebar button on admin
    And Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    When Click on the [Requirements View] sidebar button on admin
    Then The [Requirements Admin] page is opened
    When Click on the [Notifications] sidebar button on admin
    Then The [Research Notification] page is opened
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    When Click on the [Questionnaire Versions] sidebar button on admin
    Then The [Questionnaire Versions] page is opened
