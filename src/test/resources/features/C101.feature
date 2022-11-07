@C101

Feature: C101

  Scenario: Verify the "Modify Existing Facility Research from Previous Answers" functionality
    When Open Lighthouse
    Then Select the "External User" role on login page
    When Click the [Login] button
    Then The [Surveillance Setup] page is opened
    Then Enter random company name
    And Enter random facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    And Select the [Yes] requirements checks include radio button
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Save Job] button
    Then The [Surveillance Setup] page is opened
    And Newly created job with status "Saved" is displayed in the table on the [New Research] page
    #When Select already created job in the table on the [New Research] page
    When Select already created job in the table on the [New Research] page
    Then Click the [Copy From Research Job] button
    When The [Jurisdiction] page is opened
    Then Validate that previously selected jurisdictions are saved
    And Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Saved" is displayed in the table on the [View Results] page


