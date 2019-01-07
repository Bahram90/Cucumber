Feature: Test execute automation webPage
Scenario: Test login with valid credentials 
     Given Open chrome and start application 
     When I enter a valid username and valid password
     And  User should be able to login succesfully 
     Then Browser should quit 