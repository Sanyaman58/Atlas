@C168

Feature: C168

  @TestRail(168)
  Scenario: The requirement Name dropdown is filtered based on viewer filters
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    When Select the [Preliminary Data] radio button on [Requirement View] page
    When Select "Select Requirement Names" requirement name in the Requirements Viewer Filters on the [Requirement View] page
    Then Select "Alaska" jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    Then The records with "Alaska" jurisdiction is displayed in the table on the [Requirement View] page
    And Select "Drug Room" requirement name in the Requirements Viewer Filters on the [Requirement View] page
    Then The records with "Drug Room" requirement name is displayed in the table on the [Requirement View] page



