@C309
Feature: C309

  @TestRail(309) @smoke
  Scenario: Verify user is able to edit and save the already created Activity
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Activity Tracklog] button on Atlas
    Then The [Avtivity] page is opened
    And Select a already created activity
    Then Select "Initial" requirement from requirement activity dropdown list
    And Click on Edit Activity popup save button