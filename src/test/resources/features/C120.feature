@C120

Feature: C120

  @TestRail(120)
  Scenario: Version Requirements
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then The following labels are displayed in the [Versioned Requirements] table
      |JJ-CATEGORY-REQTYPE|
      |SKU|
      |Version|
      |Name Requirement|
      |Query Criteria|
      |Created|
      |Approved|
      |Activated|
      |Status|
      |Action|
    And Select "200" entries to be displayed in the [Show Entries] select on the [Versioned Requirements] page
    And 200 entries are displayed on the [View Results] page on the [Versioned Requirements] page
#    When Click on the "Name Requirement" label on the [Versioned Requirements] page
#    Then Verify that records on the [Versioned Requirements] page are sorted alphabetically by "Name Requirement" label
    When Enter "fdsafdasfdsafdasfs" in the search field on the [Versioned Requirements] page
    Then No records are displayed on the [Versioned Requirements] page
    When Enter "" in the search field on the [Versioned Requirements] page
    When Click on the [View Requirement] button of record with status "In-Progress" on the [Versioned Requirements] page
    Then The [View Requirements] page is opened after clicking on the button
    And Get the data from the [View Requirements] page
    When Click on the 'Back' browser button
    Then Click on the [Edit Requirement] button of the same record on the [Versioned Requirements] page
    And The [Edit Requirement] page is opened
    And Compare the data on the [Edit Requirement] with the data from the [View Requirement] page
