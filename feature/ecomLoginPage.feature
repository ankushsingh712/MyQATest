@test
Feature: Login to QA Test page test case

  Scenario: user able to login to QA Test page page using correct credentials
    Given user is on main login page
    When user clicks on login 
    Then user is redirected to login page
