@C141

Feature: C141

  @TestRail(141)
  Scenario: Verify that the user is enable the “Resident State” in the selector for the requirement.
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
    Then Select In-State radio button for the state "Alaska" of the RES1 question on the [Requirement View] page
    And Delete last question from the [Selector Criteria]
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that newly created requirement contains "(RES1 = AK)" selector criteria
