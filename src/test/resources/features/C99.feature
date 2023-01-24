@C99

Feature: C99

  Scenario: Verify the Login page functionality

    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    When Click the [Login Assistance] button
    Then Enter login "Test" on login page
    #Then Validate that the "Please fill out the field" message appears
    When Enter password "Test" on login page
    When Click the [Login] button
    Then Validate that the "Something went worng! Please try again" error message displayed
    And CLick the [Cancel] button
    When Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Log out from Lighthouse
    Then The [Login] page is opened