@C127

Feature: C127

  @TestRail(127)
  Scenario: Verify that user is able to see "Requirement Name" to the "Activity Log" output.
  When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    And Select "Test Pharma" client from the client dropdown
    And Select 1 company name
    And Select 1 facility name
    When Click surveillance setup [Next] button
    Then The [Jurisdiction] page is opened
    And Reload the browser
    When Select "Georgia" state on the [Jurisdiction] page
    Then Verify [ Washington DC Jurisdiction] Jurisdiction is renamed with [District of Columbia]
    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    When Click on the [Research] sidebar button on admin
    Then The [Research Admin] page is opened
    When Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    And Verify the [District of Columbia] in list of Jurisdiction
    And Click on [Requirement View] sidebar button
    And Click Jurisdiction dropdown and verify the [District of Columbia] jurisdiction
