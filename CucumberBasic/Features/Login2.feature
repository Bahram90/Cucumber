Feature: LoginFeature 

@login2
Scenario Outline: 
	Login with correct username and password using Scenario outline 
	Given I navigate to the login page 
	And I enter "<userName>" and "<password>" 
	And I click login button 
	Then should should see the userform page 
	Examples: 
		|userName   |password  |
		|execute    |automation|
		|MikeSmith  |abc123    |
		|JavaScript |protractor|