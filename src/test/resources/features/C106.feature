@C106

Feature: C106

  Scenario: Verify the navigation between pages
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When Click on the [Results] sidebar button
    Then The [View Results] page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Select 1 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Verify the breadcrumbs on the [Jurisdiction] page
    When Click the [Next] button on the [Jurisdiction] page
    Then Verify the breadcrumbs on the [Questionnaire] page
    When Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Verify the breadcrumbs on the [SaveSubmit Job] page
    And Verify the buttons on the [SaveSubmit Job] page


