@C138

Feature: C138

  @TestRail(138)
  Scenario: Verify that user is able to do multiple column searches to generate the desired results.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened
    When Enter "AL-DEA" requirement SKU in the requirement search on the [Versioned Requirements] page
    And Enter "Test" requirement name in the requirement search on the [Versioned Requirements] page
    And Enter "(RES1 = AL) and (FIN1 = Y or FIN1.1 = Y or POS1 = Y)" requirement query criteria in the requirement search on the [Versioned Requirements] page
    Then The entries are displayed on the [Versioned Requirements] page