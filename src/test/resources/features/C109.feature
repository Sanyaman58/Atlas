@C109 @Test
Feature: C109

  @TestRail(109)
  Scenario: Verify the partial surveillance functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "Test Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Test Pharma" client from the client dropdown
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
    When Select "Test Pharma" client from the client dropdown
    Then Newly created job with status "Incomplete" is displayed in the table on the [New Research] page
    And Select already created job by index 1 in the table on the [New Research] page
    And Click on [Next] button under the table on the [New Research] page
    Then The [Jurisdiction] page is opened
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Validate the [Questionnaire] page elements
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    And Verify Jurisdictions state is "Georgia" as selected earlier on the [Jurisdiction] page
