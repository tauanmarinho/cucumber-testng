Feature: Login Feature

Scenario Outline: Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| username | password |
	| user  | test@123 |
		