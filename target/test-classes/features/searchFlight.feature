@lufthansa
Feature: Flight search functionality

  @searchFlight
  Scenario: As a user I want to search a flight through Lufthansa application
    Given Open lufthansa application on android emulator
    And Navigate to Book flight page
    When User enters FROM city
    And User enters TO city
    And User selects DATE
    And User selects passengers and seat type
    And User clicks on Search
    Then User taken to Flight Search page
