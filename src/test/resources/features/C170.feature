@C170
Feature: C170

  @TestRail(170)
  Scenario: Verify that user is not able to see EUI states anymore in the configuration
    When Open Atlas
    Then Enter login "sachin.arora@pharma.solutions" on login page
    And Enter password "$hin@1122!!" on login page
    And Click the [Login] button
    And Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Reload the browser
    And Select "Pharma Solutions USA" client from [Client dropdown] and verify next button is enabled
    And Select 5 company name
    And Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    And Verify no [EUI] states are visible
    
    
    
    
    
    
    
    
    
    #When Click on [Surveillance Intelligence] dropdown button and verify options
    #Then Click on [Results] dropdown button
    #And The [View Results] page is opened
    #When Click on [Activity Logs] option of the line item
    #Then Verify [Activity Logs] screen and default filter is set to [All]