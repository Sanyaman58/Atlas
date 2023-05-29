@C313 @Smoke
Feature: C313

  @TestRail(313)
  Scenario: Verify user is able to navigate to all the Notification options under Notifications dropdown
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Notifications] atlas collapse button
    And Click on the [Tasks] notification sidebar button
    Then The [Tasks] notification page is opened
    When Click on the [Documents] notification sidebar button
    Then The [Documents] notification page is opened
    When Click on the [Expiration] notification sidebar button
    Then The [Expiration] notification page is opened
    When Click on the [Intelligence] notification sidebar button
    Then The [Intelligence] notification page is opened
