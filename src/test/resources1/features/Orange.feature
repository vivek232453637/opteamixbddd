Feature: Login page feature

Scenario: Login with correct credentials
Given user is on login page
When user enters username "Admin"
And user enters password "admin123"
And user clicks on Login button
