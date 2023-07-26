Feature: Login into Lufthansa Application

Scenario: As a user i want to log in into the Lufthansa application
Given Lufthansa application is open
When User clicks on Log in button
And user selects Lufthansa Id / Miles & More
And User enters email ID / username
And User enters password / PIN
And User clicks on Log in
Then User is Authenticated and Logged in into lufthansa application