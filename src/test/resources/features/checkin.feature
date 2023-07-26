Feature: Check booked flight

  Scenario: As a User i want to check in my flight booking
    Given Open lufthansa application
    When User clicks on Add booking / check-in
    And User enters Booking Reference
    And User enters First name
    And User enetrs Last name
    And User clicks on continue
    Then User taken to confirmation page