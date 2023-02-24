@C139

Feature: C139

  @TestRail(139)
  Scenario: Verify that user is able to see a validation message on entering wrong keywords in the search column.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Configuration] sidebar button
    Then The [Configuration] page is opened
    When Click on the [Research Notification] sidebar button on Lighthouse
    Then The [Research Notification] page is opened
    Then The following labels are displayed in the [Research Notification] table
      |Read/Unread|
      |Notification Date|
      |Type|
      |Jurisdiction|
      |Company/Facility Name|
      |Requirement Name|
      |Scope|
      |Notes|
    When Click on the "Requirement Name" label on the [Research Notification] page
    Then Verify that records on the [Research Notification] page are sorted alphabetically by "Requirement Name" label
    When Click on the "Requirement Name" label on the [Research Notification] page
    Then Verify that records on the [Research Notification] page are sorted alphabetically backwards by "Requirement Name" label
    Then Enter "gfsdgfdsgfsdgfsd" in the activity search on the [Research Notification] page
    And No records are displayed on the [Research Notification] page
    Then Enter "" in the activity search on the [Research Notification] page
    And Get requirement name of the 1 record on the [Research Notification] page
    When Enter saved requirement's name in the activity search on the [Research Notification] page
    Then Only records with entered requirement name are displayed on the [Research Notification] page
    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Versioned Requirement page is opened
    And Enter requirement name from the [Research Notifications] page in the requirement search on the [Versioned Requirements] page
    When Enter "fdsfdas" note in the Change Note For Customer section on the [Versioned Requirements] page
    Then Click on the [Save] button on the [Requirements View] page
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    And Enter requirement name from the [Research Notifications] page in the requirement search on the [Versioned Requirements] page
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened
    When Click on the [Research Notification] sidebar button on Lighthouse
    Then The [Research Notification] page is opened
    When Enter saved requirement's name in the activity search on the [Research Notification] page
    Then A record with type "Change" and "Changes were made to the following: [Change note for customer]" scope displayed in the table