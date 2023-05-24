@C306
Feature: C306

  @TestRail(306) @smoke
  Scenario: Verify user is able to add the new requirement in Add Requirement page
    When Open Atlas
    Then The [Login] page is opened
    And Validate the [Login] page elements
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    And Click on [Add Requirement] button
    Then Select "Comppany USA" company from company dropdown list
    Then Select "Facility" from facility dropdown list
    Then Select "Alabama" jurisdiction from jurisdiction dropdown list
    Then Select "Initial" requirement type from requirement type dropdown list
    Then Select "Federal License" requirement category from requirement category dropdown list
    Then Select "Client to Maintain" requirement status from requirement status dropdown list
    When Enter random requirement name on Add Requirement popup
    And Click on [Add Requirement] popup save button
    And Click on requirement successful popup okay button