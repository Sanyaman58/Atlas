@C267
Feature: C267

  @TestRail(267)
  Scenario: Verify text is wrapping in the notification
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    And Click on [Notifications] sidebar option
    When Click on [Intelligence] option
    Then Verify [Research Notfications] page is opened
    And Verify the test wrapping in the Research Notifications page
