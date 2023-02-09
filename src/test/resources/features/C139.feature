@C139

Feature: C139

  @TestRail(139)
  Scenario: Verify that user is able to see a validation message on entering wrong keywords in the search column.
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened

    When Enter "invalid keyword" requirement JJ-CATEGORY-REQTYPE in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement JJ-CATEGORY-REQTYPE in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement SKU in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement SKU in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement version in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement version in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement name in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement name in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement query criteria in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement query criteria in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement created in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement created in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement approved in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement approved in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement activated in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement activated in the requirement search on the [Versioned Requirements] page

    When Enter "invalid keyword" requirement status in the requirement search on the [Versioned Requirements] page
    Then No matching records message is displayed on the [Versioned Requirements] page
    And Enter "" requirement status in the requirement search on the [Versioned Requirements] page
