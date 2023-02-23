@C102

Feature: C102

  @TestRail(102)
  Scenario: Verify the "Surveillance Setup" page functionality (Step 1)
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify the [Surveillance Setup] section
    When Select "Pharma Solutions USA" client from the client dropdown
    Then Validate fields on the [Surveillance Setup] page
    And Validate the [Modify Existing Surveillance Configuration] table elements
    | |
    |Company Name|
    |Facility Name|
    |Status|
    |Created|
    |Action|
    And Verify radio button is enabled
