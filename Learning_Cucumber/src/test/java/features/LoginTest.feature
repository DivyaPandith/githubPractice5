Feature: Learning Scenario Outline with example

Scenario Outline: Learning to perform data driven testing using Scenario Outline

Given "chrome" browser launched,entered "https://demowebshop.tricentis.com/"
And Login page displayed
When user enters "<username>" and "<password>"
And clicks login button
Then "<username>" logged into App
And browser closed
							
Examples:
|	        username									|		password		|
|	   abhishiva1998@gmail.com				|		Rolex@1998	|
|	   yogbelavanki@gmail.com					|		Password@123|
|	   pushpalathabj98@gmail.com			|		Pushpa@1234	|