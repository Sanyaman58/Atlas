@C121

Feature: C121

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
    And "10" entries are displayed on the [View Results] page
    When Click on the "Company Name" label
    Then Verify that records on the [View Results] page are sorted alphabetically by "Company Name" label

    