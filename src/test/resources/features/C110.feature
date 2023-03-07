@C110
Feature: C110

  @TestRail(110)
  Scenario: Research Permissions
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    And Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    And Verify the names of the questions on questionnaire page
    And Select any category and click on [Add new category] button
    And Click on [Save] category button with empty category name field and verify the validation
    And Add a new category and verify new category is added
    And Select any category header and click on [Reorder category] button
    And Reorder the category headers
    And Right click on question and click on [Add New Question] buttton
    And Click on [Plus] icon besides the question
    And Enter the name of question and Click [Add] button
    And Right click on displayed question and select [Edit Question] option
    And Edit the particular question and verify the edit fields
    And Right click on question and verify the activate and deactivate functionality
    #And The [Research Admin] page is opened
    #When Click on the [Questionnaire Versions] sidebar button
    #Then Activate the newly created questionnaire
    #When Open Atlas
    #Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    #And Enter password "Testing2022!!" on login page
    #And Click the [Login] button
    #And Management Dashboard page is opened
    #When Click on the [Configuration] sidebar button
    #Then The [Configuration] page is opened
    #Then Select "Test" client from the client dropdown
    #Then Select 1 company name
    #And Select 1 facility name
    #When Click [Submit new job] button
    #Then The [Jurisdiction] page is opened
    #Then Select "Georgia" state on the [Jurisdiction] page
    #And Select all jurisdictions on the [Jurisdiction] page
    #And Get the jurisdictions checkboxes values
    #Then Click the [Next] button on the [Jurisdiction] page
    #Then The [Questionnaire] page is opened
