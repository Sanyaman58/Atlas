@C319
Feature: C319

  @TestRail(319) @smoke
  Scenario: Verify that user is able to navigate between Company Profile pages
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    When Enter login "nikita.danilevskiy@pharma.solutions" on login page
    When Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Click on [Company Profile] sidebar button on Atlas
    Then The [Company Profile] page is opened
    And Click on Profile [View Details] button
    And Verify the navigation between the company profile pages
