Feature: Test Facebook smoke scenario 

Scenario Outline: Test login with valid credentials 
	Given Open chrome and start application 
	When I enter a valid "<username>" and valid "<password>" 
	And user should be able to login succesfully 
	Then browser should quit 
	
	Examples: 
		| username | password |
		|mikeSmith1 | password1 |
		|mikeSmith2 | password2 |
		|mikeSmith3 | password3 |