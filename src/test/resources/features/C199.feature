@C199 @Selector

Feature: C199

  @TestRail(199)
  Scenario: Verify the displaying of the complex query criteria of the requirement
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
#    And Select In-State radio button for the state "Alaska" of the RES1 question on the [Requirement View] page
    And Create a complex selector criteria
#    And Get the selector criteria data in the [Selector Criteria] section
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that newly created requirement contains "((POS1.1.1 = N and PRO1 = Y and PRO1.1 = N and POS1.1.2 = N and PRO1.2 = N) or (PRO1 = Y and PRO1.1 = N and POS1.1.2 = N) or (FIN1 = Y and FIN1.1 = N and FIN1.2 = Y and POS1 = N))" selector criteria
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
