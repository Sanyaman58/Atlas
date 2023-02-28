@C172
Feature: C172

  @TestRail(172)
  Scenario: Verify that EUI version is not affecting the jurisdictions displaying
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    When Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research] sidebar button
    Then The [Research Admin] page is opened
    And Click on the [Ends Up In State] button on admin
    And The [Ends Up In States Admin] page is opened
    When Check or uncheck the jurisdiction checkbox on [End Up in States]
    Then Click on EUI save button
    When Click on the [EUI Versions] sidebar button on admin
    Then The [Versioned EUI] page is opened
    And Approve and Activate the newly created EUI version
    When Click on the [Requirements View] sidebar button on admin
    And Verify all the Jurisdictions are displayed in [Jurisidction] dropdown
    And Select 1 value from [Requirement Category] dropdown
    And Select 1 value from [Requirement Type] dropdown
    And Click on [Create New] button
    And Click on [General information] Jurisdiction dropdown and verify the count
    When Open Atlas
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    And Select "Pharma Solutions USA" client from the client dropdown
    And Reload the browser
    And Select "Pharma Solutions USA" client from the client dropdown
    And Select 5 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    And Verify the Jurisdiction checkbox values and count
    