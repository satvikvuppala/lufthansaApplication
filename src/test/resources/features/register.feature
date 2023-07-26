Feature: To register a new user

  Scenario: To register a new register a new user via the Lufthansa application
    Given Lufthansa application is opened
    When User Clicks on register
    And User scrolls down to Regsiter for Travel ID
    And User clicks on Register for Travel ID
    And enters email address
    And User enters Password
    And User clicks on Continue
    Then user taken to Registration complete page
    And application quits
