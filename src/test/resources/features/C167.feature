@C167

Feature: C167

  @TestRail(167)
  Scenario: Verify the resident state selector functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
#    When Click on the [Requirements View] sidebar button
#    Then Click on the [Requirements View] page is opened
#    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
#    And Select "Initial" Requirement Type in the [Add New Requirement] section
#    And Click the [Create New] button in the [Add New Requirement] section
#    When Enter random requirement name on the [Requirements View] page
#    And Enter random application name on the [Requirements View] page
#    Then Click on the [Question Selection] collapse on the [Requirements View] page
#    When Enter random requirement name on the [Requirements View] page
#    And Enter random application name on the [Requirements View] page
#    And Select "Alaska" jurisdiction in the [General Information] section on the [Requirements View] page
#    And Select In-State radio button for the state "Alaska" of the RES1 question on the [Requirement View] page
#    And Check 4 question in the [Question Selection] section on the [Requirements View] page
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Adam Drugs" client from the client dropdown
    And Select already created job by index 1 in the table on the [New Research] page
    When Click the [Copy From Research Job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    When Select 1 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    And Get table records on [Research Results] page
    Then Verify that requirement with "Alaska" jurisdiction, "Test1" application name and "Test1" requirement name is in the list
    When Close [Research Results] window

    And Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Adam Drugs" client from the client dropdown
    And Select already created job by index 1 in the table on the [New Research] page
    When Click the [Copy From Research Job] button
    Then The [Jurisdiction] page is opened
    Then Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    When Select 1 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    And Get table records on [Research Results] page
    Then Verify that early created requirement name is in the list