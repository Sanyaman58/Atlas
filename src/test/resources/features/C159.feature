@C159

Feature: C159

  @TestRail(159)
  Scenario: Verify that the user is able to create the tooltip for Surveillance Configuration against the questions
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on the [Questionnaire] button on admin
    Then The [Questionnaire Admin] page is opened
    When Right click on 1 question on the [Questionnaire Admin] page
    And Click on the Add Comment context menu button on the [Questionnaire Admin] page
    And Click on [Update Comment] icon of the 1 question on the [Questionnaire Admin] page
    And The [Add Comment] window is displayed on the [Questionnaire Admin] page
    Then Enter "Test comment" comment in the [Add Comment] window on the [Questionnaire Admin] page
    And Enter "https://www.google.com.ua/" URL in the [Add Comment] window on the [Questionnaire Admin] page
    And Click on the [Save Comment] button in the [Add Comment] window on the [Questionnaire Admin] page
    Then The tooltip near the 1 question is visible on the [Questionnaire Admin] page
    When Click on the [Save] button on the [Questionnaire Admin] page
    When Click on the [Questionnaire Versions] sidebar button on admin
    Then The [Questionnaire Versions] page is opened
    Then Click on the "Version" label on the [Questionnaire Versions] page is opened
    Then Click on the "Version" label on the [Questionnaire Versions] page is opened
    And Approve the 1 questionnaire version on the [Questionnaire Versions] page
    And Click on the [Yes Approve] button on the [Questionnaire Versions] page
    Then Click on the "Version" label on the [Questionnaire Versions] page is opened
    Then Click on the "Version" label on the [Questionnaire Versions] page is opened
    And Activate the 1 questionnaire version on the [Questionnaire Versions] page
    And Click on the [Yes Approve] button on the [Questionnaire Versions] page
    When Click on the [Surveillance Intelligence] sidebar collapse button on Lighthouse
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened
    Then Select "Test Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Test Pharma" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And The tooltip near the 1 question is visible on the [Questionnaire] page
    When Hover over tooltip near the 1 question on the [Questionnaire] page
    Then The tooltip window is displayed
    And The tooltip window's comment is "Test comment" on the [Questionnaire] page
    And The tooltip window's URL is "https://www.google.com.ua/" on the [Questionnaire] page

