@C109

Feature: C109

  Scenario: Verify the partial surveillance functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Click [Submit new job] button
    And Window with "Please enter all required fields" message is displayed
#    Then Enter "Test" company name
#    And Enter "Test" facility name
#    Then The "Same Company Name and Facility name already exist" message is displayed
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    Then Get the questions values
    When Click on the [Surveillance Setup] breadcrumb
    Then The [Configuration] page is opened
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Newly created job with status "Incomplete" is displayed in the table on the [New Research] page




#    And Click the [Next] button on the [Questionnaire] page
#    Then The [SaveSubmit Job] page is opened
#    When Click on the [Change Jurisdictions] button
#    Then The [Jurisdiction] page is opened
#    And Click the [Next] button on the [Jurisdiction] page
#    Then The [Questionnaire] page is opened
#    And Click the [Next] button on the [Questionnaire] page
#    When Click on the [Change Questionnaire] button
#    Then The [Questionnaire] page is opened
#    And Click the [Next] button on the [Questionnaire] page
#    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
#    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
#    When Click on the [Save Job] button
#    Then The [Configuration] page is opened
#    Then Select "Pharma Solutions USA" client from the client dropdown
#    And Newly created job with status "Saved" is displayed in the table on the [New Research] page
#    Then Enter random company name
#    And Enter random facility name
#    When Click [Submit new job] button
#    Then The [Jurisdiction] page is opened
#    When Select "Georgia" state on the [Jurisdiction] page
#    And Select all jurisdictions on the [Jurisdiction] page
#    Then Click the [Next] button on the [Jurisdiction] page
#    Then The [Questionnaire] page is opened
#    And Click the [Next] button on the [Questionnaire] page
#    Then The [SaveSubmit Job] page is opened
#    When Click on the [Submit Job] button
#    Then The [View Results] page is opened
#    And Verify that newly created job with status "Saved" is displayed in the table on the [View Results] page

