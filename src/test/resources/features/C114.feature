@C114

Feature: C114

  Scenario: UI/UX Internal User Surveillance Setup
    When Open Lighthouse
    Then Select the "System Admin" role on login page
    When Click the [Login] button
    Then The [Surveillance Setup] page is opened
    When The client dropdown is visible and clickable
    Then Select "client_1" client from the client dropdown
#    When Create a new surveillance
    Then Enter "ClientSurveillanceTest" company name
    And Enter "ClientSurveillanceTest" facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    And Select the [Yes] requirements checks include radio button
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Save Job] button
    Then The [Surveillance Setup] page is opened
    And Newly created job with status "Saved" is displayed in the table on the [New Research] page
    When Select "client_1" client from the client dropdown
    #Change the next step after the bug is fixed
    Then Newly created job with status "Incomplete" is displayed in the table on the [New Research] page
    When Select "client_2" client from the client dropdown
    Then Newly created job with status "Incomplete" is not displayed in the table on the [New Research] page
    When Open Lighthouse
    Then Select the "External User" role on login page
    When Click the [Login] button
    Then The [Surveillance Setup] page is opened
    When The client dropdown is not visible and clickable