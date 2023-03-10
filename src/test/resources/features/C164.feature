@C164

Feature: C164

  @TestRail(164)
  Scenario: Verify that the filters are not reset once an action has been performed
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    When Enter random requirement name on the [Requirements View] page
    And Enter random application name on the [Requirements View] page
    Then Click on the [Question Selection] collapse on the [Requirements View] page
    And Select "Alaska" jurisdiction in the [General Information] section on the [Requirements View] page
    And Check 3 question in the [Question Selection] section on the [Requirements View] page
    And Delete last question from the [Selector Criteria]
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the search field on the [Versioned Requirements] page
    When Get text from the search field on the [Versioned Requirements] page
    And Click on the [Delete Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on Yes Delete button on the alert window
    Then Verify that text in the search field is the same on the [Versioned Requirements] page


