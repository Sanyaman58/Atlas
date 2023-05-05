@C131

Feature: C131

  @TestRail(131)
  Scenario: Save Change Details for Notifications on Admin
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Research Notification] sidebar button on Lighthouse
    Then The [Research Notification] page is opened
    And The labels are displayed on the [Research Notification] table
      |Date/Time|
      |SKU|
      |Type|
      |Name|
      |Selector|
      |Definition|
      |Prerequisites|
      |Attachments|
      |Fees|
      |Process Time|
      |Renewal Period|
      |Bond Required|
      |Notes|
      |Change Note|
    And Click on the "Name" label on the [Research Notification] page
    And Verify that records on the [Research Notification] page are sorted alphabetically by "Name" label
    And Verify that records on the [Research Notification] page are sorted alphabetically backwards by "Name" label
    And Enter invalid data in Serach field and verify validation
    And Enter valid data in Search field and verify the data
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    And Select 4 option Requirement category dropdown
    And Select 2 option Requirement type from doropdown
    And Click on Create New button
    And Fill the required details on Requirement view page
    When Open Notification page
    Then Verify the newly created requirement on Notifications page
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    And Search the newly created requirement on [Requirement View] page
    And Verify the [Intelligence Entitlement] message is shown