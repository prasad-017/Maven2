Feature: Application login

Scenario: Home page default login
Given User is on landing page
When User log into application with "ABC" name and password "123"
Then Home page is displayed
And cards are populated