@C125

Feature: C125

  @TestRail(125)
  Scenario: Verify the box should default to 'And', while building a new Selector for a Requirement
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
    Then Click on the [Question Selection] collapse on the [Requirements View] page
    And Check 3 question in the [Question Selection] section on the [Requirements View] page
    Then Verify that 1 selector choice is "AND" on the [Requirements View] page
    




    