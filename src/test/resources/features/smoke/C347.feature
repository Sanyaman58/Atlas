@C347 @Smoke
Feature: C347

  @TestRail(347)
  Scenario: Validate Confidential document is working
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Document Repository] sidebar button
    Then The [Document Repository] page is opened
    When Select "Client142" client from the client select on the [Document Repository] page
    When Select "AR Pharma" client from the client select on the [Document Repository] page
    When Click on Request Document button on the [Document Repository] page
    Then The [Add Request Document] window is displayed
    When Select "Owner" document category on [Add Request Document] window
    And Enter random owner name on [Add Request Document] window
    And Select "Nikita Danilevskiy" assignee on [Add Request Document] window
    And Select "Contract" document type on [Add Request Document] window
    And Select [Yes] confidential document radio button on [Add Request Document] window
    And Click on Save button on [Add Request Document] window
    And Click on OK button
    Then A newly created document is displayed in the table on the [Document Repository] page


