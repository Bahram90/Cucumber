Feature: LoginFeature 
	This feature deals with login functionality of the application 
  
 @login3 
Scenario: Login with correct username and password 
	Given I navigate to the login page 
    And I enter the users email address as Email:admin
    And I verify the count of my salary digits for Rs 1000
	And I enter the following for Login 
		|userName|password|
		|admin   |adminPassword|
	And I click login button 
	Then should should see the userform page 