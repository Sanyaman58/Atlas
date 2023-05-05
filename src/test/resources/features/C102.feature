@C102
Feature: C102

  @TestRail(102)
  Scenario: Verify the "Surveillance Setup" page functionality (Step 1)
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify the [Surveillance Setup] section
    Then Validate fields on the [Surveillance Setup] page
    And Validate the [Modify Existing Surveillance Configuration] table elements
      |               |
      | Company Name  |
      | Facility Name |
      | Status        |
      | Created       |
      | Action        |
    And Verify radio button is enabled
    And Verify [Delete] button is clickable
    Then Select "AR Pharma" client from the client dropdown
    Then Click surveillance setup [Next] button
    And Verify the Validation popup
    And Reload the browser
    Then Select "AR Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "AR Pharma" client from the client dropdown
    When Select 1 company name
    And Select 1 facility name
    When Click surveillance setup [Next] button
    Then The [Jurisdiction] page is opened
    And Navigate back to surveillance page
    And Reload the browser
    Then Select "AR Pharma" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    And Select radio button of existing job and click Next
    Then The [Jurisdiction] page is opened
