@C265

Feature: C265

  @TestRail(265)
  Scenario: Verify that user is not able to see "Product Line, Business Model and Change Note" options anymore.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    When Click on the "Name" label on the [Requirements] page
    Then Right click on 1 record in the [Requirements] table
    And Click on Show Requirement Details context menu button on the [Requirements] page
    Then Verify that Product Line, Business Model and Change Note options are not visible
