 @C165

  Feature: C165

  @TestRail(165)
  Scenario: Verify that the requirement should not get duplicate after editing.
    When Open Atlas
    Then Enter login "yepsizigna@gufum.com" on login page
    And Enter password "Testing2022%%" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Versioned Requirements] sidebar button
    Then Versioned Requirement page is opened
    When Click on the "Status" label on the [Versioned Requirements] page
#    When Click on the "Status" label on the [Versioned Requirements] page
    Then Click on the [Edit Requirement] button of the 1 record on the [Versioned Requirements] page
    When Save old requirement name on the [Requirements View] page
    When Enter random requirement name on the [Requirements View] page
    Then Click on the [Save] button on the [Requirements View] page
    When Click on the [Versioned Requirements] sidebar button from admin
    Then Enter requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that record with the new requirement name is displayed on the [Versioned Requirements] page
    Then Enter old requirement name in the requirement search on the [Versioned Requirements] page
    And Verify that record with the old requirement name is not displayed on the [Versioned Requirements] page

