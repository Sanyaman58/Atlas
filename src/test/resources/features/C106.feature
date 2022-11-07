@C106

Feature: C106

  Scenario: Verify the navigation between pages
    When Open Lighthouse
#    Then Enter login "demo.user1@pharma.solutions" on login page
#    Then Enter password "shanky@1234" on login page
    Then Select the "External User" role on login page
    When Click the [Login] button
    Then The [Surveillance Setup] page is opened
    When Click on the [Results] sidebar button
    Then The [View Results] page is opened
    When Click on the [Configuration] sidebar button
    Then The [Surveillance Setup] page is opened
    Then Enter random company name
    And Enter random facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Select the [Yes] requirements checks include radio button
    And Verify the breadcrumbs on the [Jurisdiction] page
    When Click the [Next] button on the [Jurisdiction] page
    Then Verify the breadcrumbs on the [Questionnaire] page
    When Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Verify the breadcrumbs on the [SaveSubmit Job] page
    And Verify the buttons on the [SaveSubmit Job] page


