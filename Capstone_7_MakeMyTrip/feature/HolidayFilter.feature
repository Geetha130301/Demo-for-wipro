Feature: Filtering Holiday Packages

  Scenario: Navigate to the MakeMyTrip holiday package search page
    Given I click on cancel bar
    When I click on holiday package
    And I click on search bar
    And I click on other cancel bar
    And I click on duration filter
    #And I click on the search package button
    Then I should see a list of packages available in locations
