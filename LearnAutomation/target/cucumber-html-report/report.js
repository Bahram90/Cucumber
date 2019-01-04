$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MyApplicationNew.feature");
formatter.feature({
  "name": "Test Facebook smoke scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter a valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to login succesfully",
  "keyword": "And "
});
formatter.step({
  "name": "browser should quit",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mikeSmith1",
        "password1"
      ]
    },
    {
      "cells": [
        "mikeSmith2",
        "password2"
      ]
    },
    {
      "cells": [
        "mikeSmith3",
        "password3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestsNew.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid \"mikeSmith1\" and valid \"password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmokeTestsNew.I_enter_a_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTestsNew.user_should_be_able_to_login_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser should quit",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestsNew.browser_should_quit()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestsNew.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid \"mikeSmith2\" and valid \"password2\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmokeTestsNew.I_enter_a_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTestsNew.user_should_be_able_to_login_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser should quit",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestsNew.browser_should_quit()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestsNew.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid \"mikeSmith3\" and valid \"password3\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmokeTestsNew.I_enter_a_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTestsNew.user_should_be_able_to_login_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser should quit",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestsNew.browser_should_quit()"
});
formatter.result({
  "status": "passed"
});
});