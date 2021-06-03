Feature: Login Feature

Scenario Outline: Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then Close the browser


Examples:
	| username | password |
	| user  | test@123 |
		