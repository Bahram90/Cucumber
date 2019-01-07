Feature: LoginFeature 
	This feature deals with login functionality of the application 
  
 @login1 
Scenario: Login with correct username and password 
	Given I navigate to the login page 
	#	And I enter the username as "admin" and password as "adminPassword" 
	And I enter the following for Login 
		|userName|password|
		|admin   |adminPassword|
	And I click login button 
	Then should should see the userform page 
	

		
   