#@C163
#
#Feature: C163
#
#  @TestRail(163)
#  Scenario: Verify the Permissions for the role "SS-System Admin"
#    When Open Atlas
#    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
#    And Enter password "Testing2022!!" on login page
#    When Click the [Login] button
#    Then Management Dashboard page is opened
#    And Click on the [Intelligence Admin] sidebar collapse button on Lighthouse
#    And Click on [Version Requirements] dropdown option
#    And Verify that the [Activate Requirement] view option is enabled
#    And Verify [Delete Requirement] option is enabled
#    And Verify that the [Edit Requirement] option is enabled
#    And Verify that the [View Requirement] option is enabled
#    And Verify that the [Approve Requirement] option is enabled
#    And Verify that the [Intelligence Permissions] from the side menu is enabled
#    When Click on the [Configuration] sidebar button
#    Then The [Configuration] page is opened
#    And Verify [Delete Facility] button is enabled on [Configuration] page
#    When Click on the [Results] sidebar atlas button
#    Then The [View Results] page is opened
#    And Verify [View Result] and [Delete Result] button is enabled
