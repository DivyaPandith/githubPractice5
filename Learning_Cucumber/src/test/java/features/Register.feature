Feature: Register feature

Scenario: Verify user is able to Register using valid details
Given Browser is launched url is entered
And Register page is displayed
When User Clicks on male gender and enters first name,last name,email,password and Confirm password
And User Clicks on Register button
Then User is successfully Registered
And Browser closed
