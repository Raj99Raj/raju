Feature: Test login functinality

  
  Scenario: Check login is successful with valid credentials
 
    Given user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the homepage
    
    Scenario: Check login is successful with valid credentials
 
    Given user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the homepage