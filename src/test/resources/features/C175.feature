@C175
Feature: C175

  @TestRail(175)
  Scenario: Verify the permission to upload License PDF document for users with "Client Manager WG" and "Client Administrator" roles
    When Open Atlas
    Then Enter login "nikita.danilevskiy@pharma.solutions" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    When Click on the +PDF button of any requirement on the [Requirements] page
    Then The [Requirement PDF Upload] window is opened
    And Close the [Requirement PDF Upload] window
    When Log out from Atlas
    Then Enter login "yordeyasti@gufum.com" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    When Click on the +PDF button of any requirement on the [Requirements] page
    #    Then The error window with "You do not have access to this feature. Please contact Hub administrator." text is displayed on the [Requirements] page
    #    And Close the error window on the [Requirements] page
    Then The [Requirement PDF Upload] window is opened
    And Close the [Requirement PDF Upload] window
    When Log out from Atlas
    Then Enter login "tiretem642@vootin.com" on login page
    And Enter password "Testing2022!!" on login page
    And Click the [Login] button
    Then Management Dashboard page is opened
    When Click on the [Requirements] button on Atlas
    Then The [Requirements] page is opened
    When Click on the +PDF button of any requirement on the [Requirements] page
    Then The [Requirement PDF Upload] window is opened
    And Close the [Requirement PDF Upload] window
