Feature: Holiday package search and booking

  Scenario: Navigating to the MakeMyTrip holiday package search page
    Given I am on the MakeMyTrip holiday package search page
    When I click on popup cancel button
    And I enter locations at the location
    And I select the departure date
    And I select the rooms and guests
    And I click on the searh package button
    Then I should see a list of packages available in location
