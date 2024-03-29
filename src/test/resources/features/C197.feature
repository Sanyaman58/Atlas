@C197 @Selector

Feature: C197

  @TestRail(197)
  Scenario: Verify user is able to edit and update the selector criteria
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened
    When Click on the "Status" label on the [Versioned Requirements] page
    And Enter "Nikita" requirement created in the requirement search on the [Versioned Requirements] page
    When Click on the [Edit Requirement] button of the 1 record on the [Versioned Requirements] page
    Then Get requirement name from the [Edit Requirement] name
    And Check 3 question in the [Question Selection] section on the [Requirements View] page
    And Check 4 question in the [Question Selection] section on the [Requirements View] page
    And Select the last select option of the 1 select in the [Selector Criteria] section
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
