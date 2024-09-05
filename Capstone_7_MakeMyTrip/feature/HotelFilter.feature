Feature: filtering the hotels
Scenario: finding the hotels
Given I am on the Hotel search page
Then I select the filters
When I click on the searchbar
Then I enter the hotel name 
Then I select the hotel
Then Iam on hotel pages
