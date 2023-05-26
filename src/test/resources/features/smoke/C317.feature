@C317 @Smoke
Feature: C317

  @TestRail(317) @smoke
  Scenario: Verify user is able to view the uploaded document
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Document Repository] sidebar button
    Then The [Document Repository] page is opened
    When Select "AB Test" client from the client select on the [Document Repository] page
    Then Enter "ownerel" text in the search field on the [Document Repository] page
    And Double click on the 1 record on the [Document Repository] page
    Then The [Edit Document] window is opened
    When Close the [Edit Document] window
    Then Verify that +PDF button is visible
    And Click on the +PDF button
    Then The [Edit Document] window is opened
    And Verify that Select File button is visible on the [Edit Document] window
