@C196 @Selector

Feature: C196

  @TestRail(196)
  Scenario: Verify the user is able to run the requirement with another input selector criteria
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    Then Select "AB Test" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    And Select already created job by index 1 in the table on the [New Research] page
    And Click the [Copy From Research Job] button
    Then The [Jurisdiction] page is opened
    And Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    When Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    When Click on the [Clear All] button on the [Questionnaire] page
    Then Verify that all questions answers are 'No' on the [Questionnaire] page
    When Select 4 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get table records on [Research Results] page
    And Close [Research Results] window
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "AB Test" client from the client dropdown
    And Delete newly created configuration with status "Submitted"

