@C118

Feature: C118

  @TestRail(118)
  Scenario: Ends Up in States Admin
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    When Click on the [Ends Up In State] button on admin
    Then The [Ends Up In States Admin] page is opened
    And Verify the [Ends Up In States Admin] page elements
    When Uncheck 2 checkbox on the [Ends Up In States Admin] page
    And Click on the [Save] button on the [Ends Up In States Admin] page
    And Click on the [Exit] button on the [Ends Up In States Admin] page
    Then The [Research Admin] page is opened
    When Click on the [Ends Up In State] button on admin
#    Then Verify that 2 checkbox is red crossed on the [Ends Up In States Admin] page
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    When Click on the "Version" label on the [Versioned EUI] page
    When Click on the "Version" label on the [Versioned EUI] page
    Then 1 EUI with status "Pending" is displayed on the [Versioned EUI] page
    When Approve the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page
    When Click on the "Version" label on the [Versioned EUI] page
    When Click on the "Version" label on the [Versioned EUI] page
    Then Activate the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page
    When Click on the "Version" label on the [Versioned EUI] page
    When Click on the "Version" label on the [Versioned EUI] page
    Then 1 EUI with status "Activated" is displayed on the [Versioned EUI] page

    When Click on the "Version" label on the [Versioned EUI] page
    Then Activate the 1 EUI on the [Versioned EUI] page
    And Click on the [Yes Approve] button on the [Versioned EUI] page