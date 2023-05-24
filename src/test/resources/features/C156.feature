@C156
Feature: C156

  @TestRail(156)
  Scenario: Verify the Permissions for the role "research manager"
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    And Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened
    And Verify that the [Activate Requirement] view option is enabled
    And Verify [Delete Requirement] option is enabled
    And Verify that the [Edit Requirement] option is enabled
    And Verify that the [View Requirement] option is enabled
    And Verify that the [Approve Requirement] option is enabled
    And Click on the [Edit Requirement] button of record with status "Activated" on the [Versioned Requirements] page
    And Verify that the Submit for Approval button is visible
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify [Delete Facility] button is enabled on [Configuration] page
    When Click on the [Results] sidebar button on Lighthouse
    Then The [View Results] page is opened
    And Verify that [View Result] button is visible
    And Verify that [Delete Result] button is visible
