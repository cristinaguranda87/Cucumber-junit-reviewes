Feature: Login Functionality tests


  @validLogin
  Scenario: Login with valid credentials
    Given the user on the log in page
    When the user enter valid username
    And the user enter valid password
    And the user clicks the log in button
    Then the user should be able to log in