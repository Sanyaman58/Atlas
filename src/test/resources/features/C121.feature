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
#    And Select "10" entries to be displayed in the [Show Entries] select
#    And "10" entries are displayed on the [View Results] page
    When Click on the "Company Name" label
    Then Verify that records on the [View Results] page are sorted alphabetically by "Company Name" label
    When Click on the "Company Name" label
    Then Verify that records on the [View Results] page are sorted alphabetically backwards by "Company Name" label
    When Enter "fdsafsdafdsfasd" in the search field on the [View Results] page
    Then No records are displayed on the [View Results] page
    When Enter "2023" in the search field on the [View Results] page
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
#    And Verify that data in exported file is the same as on the [Research Results] page
    Then Close [Research Results] window
    When Enter "Completed with no match" in the search field on the [View Results] page
    Then Click on the [View] button of the 1 job on the [View Results] page
    And No records are displayed on the [View Results] page
    Then Close [Research Results] window
    When Enter "" in the search field on the [View Results] page
    When Get requirement data of 1 records on [Research Results] page
    Then Click on the [Delete] button of the 1 job on the [View Results] page
    Then Verify that alert message with "The selected research result will be deleted and cannot be undone. Are you sure want to delete?" message is displayed
    And Click on Yes Delete button on the alert window
    Then Verify that deleted result is not displayed in the [View Results] table
    Then Click on the [View] button of the 1 job on the [View Results] page
    And Get the number of records of the result on [Research Results] page
    Then Close [Research Results] window
    When Click on the [Activity Logs] button of the 1 job on the [View Results] page
    And Enter "Selector Successfully matched for Active Requirement SKU" in the activity search on the [Activity Logs] page
    And Get activity logs count
    And Verify that the number of activity logs and the number of the records on the [Research Results] page is the same
    Then Click on the 'Back' browser button
    Then Click on the [Configuration] sidebar button on Lighthouse
    And The [Configuration] page is opened

    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete job from the table if exists
    Then Select "Pharma Solutions USA" client from the client dropdown
    Then Select 1 company name
    Then Select 1 facility name
    When Click [Submit new job] button
    Then The [Jurisdiction] page is opened
    Then Select "Alaska" state on the [Jurisdiction] page
    And Select all jurisdictions on the [Jurisdiction] page
    And Get the jurisdictions checkboxes values
    Then Click the [Next] button on the [Jurisdiction] page
    Then The [Questionnaire] page is opened
    And Select 1 question on the [Questionnaire] page
    Then Get the questions values
    And Click the [Next] button on the [Questionnaire] page
    Then The [SaveSubmit Job] page is opened
    Then Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier
    And Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier
    When Click on the [Submit Job] button
    Then The [View Results] page is opened
    And Verify that newly created job with status "Completed with match" is displayed in the table on the [View Results] page
    When Click on the [View] button of the newly created job on the [View Results] page
    Then The [Research Results] page is opened
    And Get table records on [Research Results] page
    Then Verify that early created requirement name is in the list
    And Close [Research Results] window
    Then Click on the [Configuration] sidebar button on Lighthouse
    Then Select "Pharma Solutions USA" client from the client dropdown
    And Delete newly created configuration with status "Submitted"


