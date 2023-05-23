@C258

Feature: C258

  @TestRail(258)
  Scenario: In User Master, SS-Admin should not be able to select SS-System Admin
    When Open Atlas
    Then Enter login "hofyikomli@gufum.com" on login page
    And Enter password "Testing2022%%" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [User Master] sidebar button
    Then The [User Master] page is opened
    Then Type "hofyikomli@gufum.com" in the email search on the [User Master] page
    And Double click on the 1 record on the [User Master] page
    When Verify that "SS-System Admin" role is not available in the Roles-Management select on the [User Master] page
    And Verify that "SS-System Admin" role is not available in the Roles-Compliance Intelligence select on the [User Master] page

