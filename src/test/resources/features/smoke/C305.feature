@C305
Feature: C305

  @TestRail(305) @smoke
  Scenario: Verify user is able to navigate to all the grid
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    When Enter login "qaexternalssUser01@mailinator.com" on login page
    When Enter password "qaExternalSSuser@01" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    When Click on [Document Repository] sidebar button on Atlas
    Then The [Documents] page is opened
    When Click on [Company Profile] sidebar button on Atlas
    Then The [Company Profile] page is opened