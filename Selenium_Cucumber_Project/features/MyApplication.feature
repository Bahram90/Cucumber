Feature: Test Facebook smoke scenario

      Scenario: Test login with valid credentials
         Given Open chrome and start application 
         When I enter a valid "4129548292" and valid "Wonderful05091990" 
         And user should be able to login succesfully 
         Then browser should quit 
        