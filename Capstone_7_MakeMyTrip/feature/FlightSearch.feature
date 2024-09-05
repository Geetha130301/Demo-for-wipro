Feature: Flight Search Automation

  Scenario: Search for flights based on yourlocation, destination, and dates
    Given I am on the MakeMyTrip flight search page
    When I click on cancel button
    And I enter location at From
    And I enter location at To
    And I select Departure date
    And I click on the search button
    Then I validate with title
