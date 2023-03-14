@C117

Feature: C117
  ######## Need to rewrote after QA environment is fixed #########
  @TestRail(117)
  Scenario: Requirements Admin
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements View] sidebar button
    Then The [Requirements View] page is opened
    And Validate the [Add New Requirement] elements on the [Requirements View] page
    Then Click the [Create New] button in the [Add New Requirement] section
    And Pop up window with "Please select Requirement Category and Requirement Type" message is displayed
    Then Close pop up window
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    When Click on the [Save] button on the [Requirements View] page
    Then Pop up window with "Please fill all required fileds." message is displayed
    Then Close pop up window
    When Enter random requirement name on the [Requirements View] page
    And Enter random application name on the [Requirements View] page
    Then Click on the [Question Selection] collapse on the [Requirements View] page
    And Select "Alaska" jurisdiction in the [General Information] section on the [Requirements View] page
    When Click on the [Save] button on the [Requirements View] page
#    Then Pop up window with "Please create a valid selector criteria." message is displayed
#    Then Close pop up window
    And Check 4 question in the [Question Selection] section on the [Requirements View] page
    And Delete last question from the [Selector Criteria]
    When Click on the [Save] button on the [Requirements View] page
    Then Select the [Preliminary Data] radio button on [Requirement View] page
    And Select "Alaska" jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    Then Newly created job with status "In-Progress" is displayed in the table on the [Requirements View] page
    When Select "State Licensing" Requirement Category in the [Add New Requirement] section
    And Select "Initial" Requirement Type in the [Add New Requirement] section
    And Click the [Create New] button in the [Add New Requirement] section
    When Enter random requirement name on the [Requirements View] page
    And Enter random application name on the [Requirements View] page
    Then Click on the [Question Selection] collapse on the [Requirements View] page
    And Select "Alaska" jurisdiction in the [General Information] section on the [Requirements View] page
    And Check 3 question in the [Question Selection] section on the [Requirements View] page
    And Delete last question from the [Selector Criteria]
    Then Click on the [Submit for Approval] button on the [Requirements View] page
    Then Select the [Preliminary Data] radio button on [Requirement View] page
    And Select "Alaska" jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page
    Then Newly created job with status "Approval Pending" is displayed in the table on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Versioned Requirement page is opened
    When Click on the [Edit Requirement] button of record with status "In-Progress" on the [Versioned Requirements] page
    Then Verify the [View Edit Existing Requirement] elements on the [Requirements View] page
    Then Validate the [General Information] elements on the [Requirements View] page
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
