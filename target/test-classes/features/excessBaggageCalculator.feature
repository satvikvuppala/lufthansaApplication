Feature: Check and calculate the baggage

  Scenario: As a user I want to check baggage allowance
    Given Open Luftahnsa application
    When User clicks on menu
    And User clicks on Baggage
    And User clicks on Baggage Policy
    And User scrolls down to Baggage Calculator
    And User clicks on Baggage Calculator
    And User enters journey/trip details
    And User selects Status type
    And user clicks on Calculate Baggage
    Then User is shown Baggage Calculator page with all the details