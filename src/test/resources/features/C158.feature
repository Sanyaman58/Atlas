@C158

Feature: C158

  @TestRail(158)
  Scenario: Verify that the External users are able to see the client dropdown on the results screen
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And The client dropdown is visible and clickable
    Then Select "AB Test" client from the client dropdown
    Then 1 record is displayed in the table on the [Configuration] page
    When Click on the [Results] sidebar button on Lighthouse
    Then The [View Results] page is opened
    Then Select "AB Test" client from the client dropdown
#    And Select "newcompany" company from the client dropdown on the [View Results] page
    Then 1 record is displayed in the table on the [View Results] page

