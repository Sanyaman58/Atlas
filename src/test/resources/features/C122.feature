@C122

Feature: C122

  @TestRail(122)
  Scenario: Verify that user is able to update the status of existing configuration
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "AR Pharma" client from the client dropdown
    And Delete job from the table if exists
    When Create a new surveillance with status [Incomplete] for "AR Pharma" client with 1 company name, 1 facility name and "Georgia" state
    Then Select "AR Pharma" client from the client dropdown
    And Newly created job with status "Incomplete" is displayed in the table on the [New Research] page
    When Select newly created job on the [New Research] page
    Then The [Jurisdiction] page is opened
    When Select "Georgia" state on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Save Job] button
    Then The [Configuration] page is opened
    Then Select "AR Pharma" client from the client dropdown
    And Newly created job with status "Saved" is displayed in the table on the [New Research] page
    Then Select newly created job on the [New Research] page
    Then The [Jurisdiction] page is opened
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page

    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "AR Pharma" client from the client dropdown
    Then Delete newly created configuration with status "Saved"
    Then Select "AR Pharma" client from the client dropdown
    And Verify that the configuration is deleted on the [Configuration] page
    




    