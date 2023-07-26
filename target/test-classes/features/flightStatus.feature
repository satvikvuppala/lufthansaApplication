Feature: Flight status check

  Scenario: As a user I want to check the latest status of the flight by flight number
    Given Open Lufthansa Application
    When User navigates to Flight Status
    And User selects airline
    And User select Flight number
    And User selects date
    And User clicks on search
    Then User is taken to flight details page

  Scenario: As a user I want to check the latest status of the flight by flight route
    Given Open Lufthansa Application
    When User navigates to Flight Status
    And User clicks on route
    And User enters From city
    And User enters To city
    And User selects date
    And User selects time frame
    And User clicks on search
    Then User is taken to flight details page
