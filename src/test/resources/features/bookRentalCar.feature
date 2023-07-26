Feature: Booking a rental car

Scenario: As a user I want to book a rental car from the Lufthansa application
Given Lufthansa application is open
When User is navigated to All services at a glance
And User scrolls to Rental car
And user click on Book now
And User eneters pick-up/drop-off location
And User selects Pick-up date and Time
And User selects Drop-off date and time
And user selects Driver age
And User selects their location
And User clicks on Search button
Then User is shown the list of cars available  