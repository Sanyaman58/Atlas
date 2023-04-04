@C166
Feature: C166

  @TestRail(166)
  Scenario: Verify that the "Showing X to Y of Z" is displayed under the table on the "Configuration" page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    And Verify no [Intelligence Entitlement] message is shown without selecting any Client
    When Select "Test Pharma" client from the client dropdown
    Then Verify the [Intelligence Entitlement] message is shown
