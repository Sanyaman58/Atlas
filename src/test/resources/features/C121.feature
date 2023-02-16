@C121

Feature: C121

  @TestRail(121)
  Scenario: View surveillance results on the [Surveillance Results] page
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Results] sidebar atlas button
    Then The [View Results] page is opened
    Then The following labels are displayed
      |Date/Time|
      |Company Name|
      |Facility Name|
      |Initiated By|
      |Status|
      |Action|
    And Select "10" entries to be displayed in the [Show Entries] select
#    And "10" entries are displayed on the [View Results] page
    When Click on the "Company Name" label
    Then Verify that records on the [View Results] page are sorted alphabetically by "Company Name" label
    When Click on the "Company Name" label
    Then Verify that records on the [View Results] page are sorted alphabetically backwards by "Company Name" label
    When Enter "fdsafsdafdsfasd" in the search field on the [View Results] page
    Then No records are displayed on the [View Results] page
    When Enter "2023" in the search field on the [View Results] page
#    Then Records containing "" text are displayed in the table on the [View Results] page
    When Enter "" in the search field on the [View Results] page
    When Click on the "Status" label
    Then Click on the [View] button of the 1 job on the [View Results] page
    And The [Research Results] page is opened
    Then The following labels are displayed on the [Research Results] page
      |Jurisdiction|
      |Application Name|
      |Requirement Name|
      |Definition|
      |Notes|
      |Processing Time|
      |Renewal Term|
      |Application Type|
      |Application Fee|
      |Additional Application Fees|
      |Bond Required?|
      |Bond Fee|
      |Controlled Substance Fee|
      |Renewal Fee|
      |Designated Rep Required?|
      |Foreign Qualification Required?|
      |Registered Agent Required?|
      |Attachments|
      |Prerequisites|
    When Get fixed labels coordinates on the [Research Results] page
    And Scroll to "Prerequisites" label on the [Research Results] page
    Then Verify that fixed labels coordinates didn't changed
    When Click on the [Export] button on the [Research Results] page
    And Verify that data in exported file is the same as on the [Research Results] page
    Then Close [Research Results] window
    When Enter "Completed with no match" in the search field on the [View Results] page
    Then Click on the [View] button of the 1 job on the [View Results] page
    And No records are displayed on the [Research Results] page
    When Enter "" in the search field on the [View Results] page