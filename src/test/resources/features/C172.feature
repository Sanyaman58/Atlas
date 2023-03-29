@C172
Feature: C172

  @TestRail(172)
  Scenario: Verify that EUI version is not affecting the jurisdictions displaying
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    When Uncheck 1 checkbox on the [Ends Up In States Admin] page
    Then Click on the [Save] button on the [Ends Up In States Admin] page
#    And Verify that 1 checkbox is red crossed on the [Ends Up In States Admin] page
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    Then Click on the "Version" label on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    And Approve the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    And Activate the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page

    When Click on the [Requirements View] sidebar button on admin
    Then The [Requirements View] page is opened
    And Verify that all 53 states are selectable in the Requirements Viewer Filters Jurisdiction select on the [Requirements View] page
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    Then Verify that all 53 states are selectable in the General Information Jurisdiction select on the [Requirements View] page

    When Click on the [Surveillance Intelligence] sidebar collapse button on Lighthouse
    When Click on the [Configuration] sidebar button on Lighthouse
    Then The [Configuration] page is opened
    Then Select "Test Pharma" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Test Pharma" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Verify that all 53 states are visible and enabled

    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    When Click on the [Research] sidebar button on admin
    Then The [Research Admin] page is opened
    When Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    When Check 1 checkbox on the [Ends Up In States Admin] page
    Then Click on the [Save] button on the [Ends Up In States Admin] page
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    Then Click on the "Version" label on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    And Approve the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    Then Click on the "Version" label on the [Versioned EUI] page
    And Activate the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page
