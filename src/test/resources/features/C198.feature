@C198 @Selector

Feature: C198

  @TestRail(198)
  Scenario: Verify user is able to run the requirement with edited selector criteria
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened
    When Click on the "Created" label on the [Versioned Requirements] page
    And Click on the "Created" label on the [Versioned Requirements] page
    When Click on the [Edit Requirement] button of the 1 record on the [Versioned Requirements] page
    Then Get requirement name from the [Edit Requirement] name
    And Check 1 question in the [Question Selection] section on the [Requirements View] page
    And Check 2 question in the [Question Selection] section on the [Requirements View] page
    And Select the last select option of the 1 select in the [Selector Criteria] section
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    When Click on the [Surveillance Intelligence] sidebar collapse button on Lighthouse
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Select 4 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get table records on [Research Results] page
    Then Verify that early created requirement name is in the list
    And Close [Research Results] window
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete newly created configuration with status "Submitted"
