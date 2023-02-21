@C173

Feature: C173

  @TestRail(173)
  Scenario: Verify roles changes in User Master on "Add User" screen
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [User Master] sidebar button
    Then The [User Master] page is opened
    When Click [Add User] button
    Then Add User popup window opened
    And Verify [Category] roles in the [Category] dropdown
    | |
    |Internal|
    |External-WG|
    |IT Support|
    |Customer Support|
    |External-SS|
    When Select "Internal" from the category dropdown menu
    Then Verify [Roles-Compliance Intelligence] roles in dropdown
    | |
    |System Admin|
    |Research Associate|
    |Research Manager|
    |Research Activator|
    |Internal Manager|
    |Internal User|
    |Internal-No Access|
    When Select "External-WG" from the category dropdown menu
    Then Verify [Roles-Compliance Intelligence] roles in dropdown
    | |
    |WG-External Manager|
    |WG-External User|
    |WG-No Access|
    When Select "IT Support" from the category dropdown menu
    Then Verify [Roles-Compliance Intelligence] roles in dropdown are none