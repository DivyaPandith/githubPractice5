Feature: Cart Feature

Scenario: Verify user is able to add product to the cart

Given Browser is launched ,url is entered
And Login is displayed
When User enters valid credentials
And User Clicks login button
Then User logged in
When User add a product to the cart
Then product should be added to the cart
And Browser is closed at the end