Feature: Hotel search

  Scenario: As a User i want to search for hotels using lufthansa application
    Given Open lufthansa application
    When User clicks on menu
    And User Clicks on Plan trip
    And User clicks on Hotel
    And User enters location
    And User enters check in date
    And User enters check out date
    And User selects No. of adults and chilren and room
    And User clicks on Search
    And User is shown the list of hotels available

  Scenario: As a user, i want to book a hotel using lufthansa application
    Given User is shown the list of available hotels
    When User selects hotel
    And User selects room
    And User enters user details
    And User clicks on Go to final step
    And User selects payment method
    And User enters payment details
    And User clicks on Complete Booking
    Then User payment is authenticated
    And Booking confirmation page is displayed