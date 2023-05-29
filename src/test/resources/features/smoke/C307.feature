@C307
Feature: C307

  @TestRail(307) @smoke
  Scenario: Verify user is able to edit and save the already created requirement
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    And Open any existing requirement
    And Enter random requirement name on Add Requirement popup
    And Click on [Add Requirement] popup save button
    And Click on requirement successful popup okay button
