Feature: Test Facebook smoke scenario 

Scenario: Test login with valid credentials 
	Given Open chrome and start application 
	When I enter a valid username and valid password 
	And user should be able to login succesfully 
	Then browser should quit 