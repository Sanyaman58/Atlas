@C162
Feature: C162

  @TestRail(162)
  Scenario: Verify the Permissions for the role "System Admin"
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    And Click on [Intelligence Admin] dropdown button
    And Verify [Requirement View] option is displayed
    And Click on [Version Requirement] side bar button and verify page
    And Verify that the [Activate Requirement] view option is enabled
    And Verify [Delete Requirement] option is enabled
    And Verify that the [Edit Requirement] option is enabled
    And Verify that the [View Requirement] option is enabled
    And Verify that the [Approve Requirement] option is enabled
    And Verify that the [Intelligence Permissions] from the side menu is enabled
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    #And Verify [Delete Facility] button is enabled on [Configuration] page
    When Click on the [Results] sidebar atlas button
    Then The [View Results] page is opened
    And Verify [View Result] and [Delete Result] button is enabled
