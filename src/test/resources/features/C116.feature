@C116

Feature: C116

  Scenario: Requirements View
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    And Validate the [Requirements Viewer Filters] elements on the [Requirements View] page
    Then Select the [Production Data] radio button on [Requirement View] page
    Then The [Requirement Viewer] table is displayed
    Then The following labels are displayed in the [Requirements Viewer] table
      |Jurisdiction|
      |Application Name|
      |Requirement Name|
      |Status|
      |Change Submitter|
      |Approver/Rejector|
      |Category|
      |Type|
      |Definition|
      |Notes|
      |Processing Time|
      |Renewal Term|
      |Application Type|
      |Application Fee|
      |Additional Application Fee|
      |Controlled Substance Fee|
      |Renewal Fee|
      |Bond Requried?|
      |Bond Amount|
      |Registered Agent Required?|
      |Foreign Qualification Required?|
      |Attachments|
      |Prerequisites|
    Then Select the [Preliminary Data] radio button on [Requirement View] page
    Then The [Requirement Viewer] table is displayed
    Then The following labels are displayed in the [Requirements Viewer] table
      |Jurisdiction|
      |Application Name|
      |Requirement Name|
      |Status|
      |Change Submitter|
      |Approver/Rejector|
      |Category|
      |Type|
      |Definition|
      |Notes|
      |Processing Time|
      |Renewal Term|
      |Application Type|
      |Application Fee|
      |Additional Application Fee|
      |Controlled Substance Fee|
      |Renewal Fee|
      |Bond Requried?|
      |Bond Amount|
      |Registered Agent Required?|
      |Foreign Qualification Required?|
      |Attachments|
      |Prerequisites|
    When Right click on 1 record in the [Requirement Viewer] table
    Then Click on the [View Requirement] button on the [Requirement View] page
    Then The [View Requirements] page is opened
    When Close the current tab
    When Right click on a record with status "Approval Pending" in the [Requirement Viewer] table
    Then The [Edit Requirement] button is not visible
    When Right click on a record with status "In-Progress" in the [Requirement Viewer] table
    Then Click on the [Edit Requirement] button on the [Requirement View] page
    And Validate the [General Information] elements on the [Requirements View] page
    When Click on the [Required] collapse on the [Requirements View] page
    Then Validate the [Required] elements on the [Requirements View] page
    When Click on the [Attachments] collapse on the [Requirements View] page
    Then Validate the [Attachments] checkboxes on the [Requirements View] page
    When Click on the [Prerequisites] collapse on the [Requirements View] page
    Then Validate the [Prerequisites] checkboxes on the [Requirements View] page
    When Click on the [Product Line] collapse on the [Requirements View] page
    Then Validate the [Product Line] checkboxes on the [Requirements View] page
    When Click on the [Business Model] collapse on the [Requirements View] page
    Then Validate the [Business Model] checkboxes on the [Requirements View] page
    When Click on the [Question Selection] collapse on the [Requirements View] page
    Then Validate the [Question Selection] checkboxes on the [Requirements View] page
    And Validate the [Selector Criteria] selects on the [Requirements View] page
    And Validate the Change Note for Customer] input on the [Requirements View] page
