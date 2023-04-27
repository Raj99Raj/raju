Feature: Test login functinality

  @Smoke
  Scenario: Sample1
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the homepage

  @Regression
  Scenario: Sample2
    Given
    When
    And

