@C100

Feature: C100

  Scenario: Verify the "New Facility" creation functionality
    When Open Lighthouse
#    Then Enter login "demo.user1@pharma.solutions" on login page
#    Then Enter password "shanky@1234" on login page
    Then Select the "External User" role on login page
    When Click the [Login] button
    Then The [Surveillance Setup] page is opened
    When Validate fields on the [Surveillance Setup] page
    Then Click [Submit new job] button
    And Window with "Please enter all required fields" message is displayed
#    Then Enter "Test" company name
#    And Enter "Test" facility name
#    Then The "Same Company Name and Facility name already exist" message is displayed
    Then Enter random company name
    And Enter random facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    And Select the [Yes] requirements checks include radio button
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    When Click on the [Jurisdiction] breadcrumb
    Then The [Jurisdiction] page is opened
    And Validate that previously selected jurisdictions are saved
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Validate the [Questionnaire] page elements
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Change Jurisdictions] button
    Then The [Jurisdiction] page is opened
    And Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    When Click on the [Change Questionnaire] button
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Save Job] button
    Then The [Surveillance Setup] page is opened
    And Newly created job with status "Saved" is displayed in the table on the [New Research] page
    Then Enter random company name
    And Enter random facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Select the [Yes] requirements checks include radio button
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Saved" is displayed in the table on the [View Results] page

