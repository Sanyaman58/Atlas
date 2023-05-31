@C259 @Selector
Feature: C259

  @TestRail(259)
  Scenario: Verify the displaying of the complex query criteria of the requirement 2.0
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
    And Select "Massachusetts" jurisdiction in the [General Information] section on the [Requirements View] page
    When Select In-State radio button for the state "Massachusetts" of the RES1 question on the [Requirement View] page
    And Create a complex selector criteria 2.0
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that newly created requirement contains "(RES1 = MA) and (FIN1 = Y and FIN1.2 = Y and PRO3.1 = Y and PRO3.5 = Y and PRO5.4.1 = Y and PRO5.4.2 = Y and PRO6.10 = Y and PRO6.3 = Y)" selector criteria
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    When Click on the [Surveillance Intelligence] sidebar collapse button on Lighthouse
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened
    Then Select "AR Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AR Pharma" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Massachusetts" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Select the [Yes] requirements checks include radio button
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [Activity Logs] button of the newly created job on the [View Results] page
    And The [Activity Logs] page is opened
    Then Enter requirement name in the activity search on the [Activity Logs] page
    And Verify that log containing "(RES1 = MA) and (FIN1 = Y and FIN1.2 = Y and PRO3.1 = Y and PRO3.5 = Y and PRO5.4.1 = Y and PRO5.4.2 = Y and PRO6.10 = Y and PRO6.3 = Y)" description text is displayed on the [Activity Logs] page
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "AR Pharma" client from the client dropdown
    And Delete newly created configuration with status "Submitted"
