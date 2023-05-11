@C222
Feature: C222

  @TestRail(222)
  Scenario: Verify that there is Release Notes for LighthouseAI for Home page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    And Click the [Home] sidebar button
    And Verify [Release Notes] is present on the Homepage