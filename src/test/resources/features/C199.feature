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
    When Select Out-Of-State radio button for the state "Vermont" of the RES1 question on the [Requirement View] page
    And Create a complex selector criteria
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that newly created requirement contains "(RES1 != VT) and ((FIN1 = Y and FIN1.1 = Y and POS1 = Y and PRO4.12 = N and PRO1.1 = N) or (FIN1 = N and POS1 = Y and POS1.1 = Y and PRO1.1 = N and PRO4.12 = N and POS1.1.1 = Y) or (FIN1 = Y and POS1.1 = Y and POS1.1.9 = N and POS1.1.4 = N and PRO4.12 = N and PRO1.1 = N) or (FIN1 = Y and POS1 = Y and FIN1.2 = Y and FIN1 = Y and PRO4.12 = N and FIN1.1 = N))" selector criteria
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    When Click on the [Surveillance Intelligence] sidebar collapse button on Lighthouse
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened
    Then Select "Test Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Test Pharma" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Select the [Yes] requirements checks include radio button
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Select questions to match the complex selector criteria
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get table records on [Research Results] page
    Then Verify that early created requirement name is in the list
    And Close [Research Results] window
    When Click on the [Activity Logs] button of the newly created job on the [View Results] page
    And The [Activity Logs] page is opened
    Then Enter requirement name in the activity search on the [Activity Logs] page
    And Verify that log containing "(RES1 != VT) and ((FIN1 = Y and FIN1.1 = Y and POS1 = Y and PRO4.12 = N and PRO1.1 = N) or (FIN1 = N and POS1 = Y and POS1.1 = Y and PRO1.1 = N and PRO4.12 = N and POS1.1.1 = Y) or (FIN1 = Y and POS1.1 = Y and POS1.1.9 = N and POS1.1.4 = N and PRO4.12 = N and PRO1.1 = N) or (FIN1 = Y and POS1 = Y and FIN1.2 = Y and FIN1 = Y and PRO4.12 = N and FIN1.1 = N))" description text is displayed on the [Activity Logs] page

    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "AB Test" client from the client dropdown
    And Delete newly created configuration with status "Submitted"