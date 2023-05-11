@C277

Feature: C277

  @TestRail(277)
  Scenario: Verify the new DoA category for the requirement
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    When Select "DoA" Requirement Category in the [Add New Requirement] section
    Then Click on [Version Requirements] sidebar button
    And The [Version Requirements] page is opened
    Then Click on the [Edit Requirement] button of record with status "In-Progress" on the [Versioned Requirements] page
    When Select "DoA" Requirement Category in the [Add New Requirement] section
    Then Click on [Active Requirements] sidebar button
    And The [Active Requirements] page is opened
    When Click on [View] button of any requirement on the [Active Requirements] page
    Then Click on the [Edit Requirement] button on the [Active Requirements] page
    When Select "DoA" Requirement Category in the [Add New Requirement] section


