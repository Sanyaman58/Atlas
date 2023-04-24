@C116

Feature: C116

  @TestRail(116)
  Scenario: Requirements View
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    And Validate the [Requirements Viewer Filters] elements on the [Requirements View] page
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
    And Get the data from the [View Requirements] page
    When Close the current tab
    When Right click on a record with status "Approval Pending" in the [Requirement Viewer] table
    Then The [Edit Requirement] button is not visible
    When Right click on a record with status "Activated" in the [Requirement Viewer] table
    Then Click on the [Edit Requirement] button on the [Requirement View] page
    And Validate the [General Information] elements on the [Requirements View] page
    And Get the data from the [Edit Requirement] page
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
    And Validate the [Change Note for Customer] input on the [Requirements View] page
    When Check the [RES1: Apply Resident State Selector Criteria] checkbox
    Then The resident state select and resident type radio buttons are displayed
    When Uncheck the [RES1: Apply Resident State Selector Criteria] checkbox
    Then The resident state select and resident type radio buttons are not displayed
    When Click on the [Edit Requirement] button of record with status "In-Progress" on the [Versioned Requirements] page
    And Compare the data on the [Edit Requirement] with the data from the [View Requirement] page
    When Select "Approved" status in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    When Right click on a record with status "Approved" in the [Requirement Viewer] table
    Then The [Delete Requirement] button is not visible
    When Select "Pending-Approval" status in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    When Right click on a record with status "Approval Pending" in the [Requirement Viewer] table
    Then Click on the [Delete Requirement] button on the [Requirement View] page
    Then Window with "Are you sure want to delete this Versioned Requirement?" message is displayed
    And Click on Yes Delete button on the alert window
    When Select saved requirement's jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    And Verify that deleted requirement is not displayed in the [Requirement Viewer] table
    When Click the [Create New] button in the [Add New Requirement] section
    Then Pop up window with "Please select Requirement Category and Requirement Type" message is displayed
    And Close pop up window
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    Then Pop up window with "Please fill all required fileds." message is displayed
    And Close pop up window
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    When Enter random requirement name on the [Requirements View] page
    And Enter random application name on the [Requirements View] page
    Then Click on the [Question Selection] collapse on the [Requirements View] page
    And Select "Georgia" jurisdiction in the [General Information] section on the [Requirements View] page
    And Check 3 question in the [Question Selection] section on the [Requirements View] page
    And Delete last question from the [Selector Criteria]
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    When Select saved requirement's jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    When Select "Select Status" status in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    And Select the [Preliminary Data] radio button on [Requirement View] page
    And Verify that newly created requirement is displayed in the [Requirement Viewer] table
