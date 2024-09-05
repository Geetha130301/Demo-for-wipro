Feature: Hotels search

  Scenario: Navigate to the MakeMyTrip hotel search page
    Given Iam on the MakeMyTrip hotels search pages
    When I click on Adv cancel button
    When I enter place at the location
    And I select the check-in date  and chechout date
    And I select the num of guests
    Then I clicked on the search Hotels element button
