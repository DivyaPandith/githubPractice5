Feature: Login feature

Scenario: Verify user is able to login using valid credentials

Given Browser is launched and url is entered
And Login page is displayed
When User enters valid username and Password
And User Clicks on login button
Then User is successfully logged in
And Browser is closed

