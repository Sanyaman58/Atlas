@C132

Feature: C132

  @TestRail(132)
  Scenario: Verify the Research Notification Changes Functionality
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
      |Date/Time|
      |Jurisdiction|
      |Category|
      |Application Name|
      |Requirement Name|
      |SKU|
      |Type|
      |Name|
      |Selector|
      |Definition|
      |Prerequisites|
      |Attachments|
      |Fees|
      |Forms|
      |Application Type|
      |Application Fee|
      |Additional Application Fees|
      |Bond Fee|
      |Controlled Substance Fee|
      |Renewal Fee|
      |Designated Rep Required?|
      |Foreign Qualification Required?|
      |Registered Agent Required?|
      |Version Number|
      |Change made by|
      |Process Time|
      |Renewal Period|
      |Bond Required|
      |Notes|
      |Change Note|
    When Click on the "Name" label on the [Research Notification] page
    Then Verify that records on the [Research Notification] page are sorted alphabetically by "Name" label
    When Click on the "Name" label on the [Research Notification] page
    Then Verify that records on the [Research Notification] page are sorted alphabetically backwards by "Name" label
    When Click on the "Name" label on the [Research Notification] page
    Then Enter "gfsdgfdsgfsdgfsd" in the activity search on the [Research Notification] page
    And No records are displayed on the [Research Notification] page
    Then Enter "" in the activity search on the [Research Notification] page
    And Get SKU of the 1 record on the [Research Notification] page
    When Enter saved SKU in the activity search on the [Research Notification] page
    Then Only records with entered SKU are displayed on the [Research Notification] page
#    When Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Versioned Requirement page is opened
    And Enter requirement SKU from the [Research Notifications] page in the SKU search on the [Versioned Requirements] page
    Then Approve the requirement if not approved on the [Versioned Requirements] page
    And Activate the requirement if not activated on the [Versioned Requirements] page
    And Click on the [Edit Requirement] button of record with status "Activated" on the [Versioned Requirements] page
    And Enter random processing time on the [Requirements View] page
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    And Get SKU of the 1 record on the [Versioned Requirements] page
    And Click on the [Approve Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    Then Click on the [Activate Requirement] button of the record by 1 index on the [Versioned Requirements] page
    And Click on the [Yes Approve] button on the [Requirements View] page
    When Click on the [Research Notification] sidebar button on Lighthouse
    Then The [Research Notification] page is opened
    When Enter saved SKU in the Versioned Requirement page on the [Research Notification] page
    Then A record with type "Update" and changed processing time scope displayed in the table