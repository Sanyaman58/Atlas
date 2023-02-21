@C174
Feature: C174

  @TestRail(174)
  Scenario: Verify the "Add Client" creation functionality
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Client Master] sidebar button
    Then The [Client Master] page is opened
    When Click [Add Client] button
    Then add client popup wondow is opened
    Then verify the following fileds are displayed on the client master page
      | Client Name *     |
      | Client Code *     |
      | Client Status*    |
      | Accounting Hold * |
      | Client Category   |
      | Account Manager   |
      | Address-1         |
      | Address-2         |
      | City              |
      | State             |
      | Zip               |
      |                   |
      | County            |
      | Country           |
      | Phone             |
      | Tollfree          |
      | Fax               |
      | Client Website    |
      | Name              |
      | Email             |
      | Phone             |
      | Cell              |
      | Name              |
      | Email             |
      | Phone             |
      | Cell              |
      | FIEN No.          |
      | Notes             |
