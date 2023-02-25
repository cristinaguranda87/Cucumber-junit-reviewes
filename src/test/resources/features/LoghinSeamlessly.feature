Feature: Login Functionality tests

@validLogin
  Scenario: Login with valid credentials
    Given the user on the log in page
    When the user enter valid username
    And the user enter valid password
    And the user clicks the log in button
    Then the user should be able to log in

  @validLoginWithParametres
  Scenario: Login with valid credentials
    Given the user on the log in page
    When the user enter valid username "Employee61"
    And the user enter valid password "Employee123"
    And the user clicks the log in button
    Then the user should be able to log in


  Scenario: Login with valid credentials
    Given the user on the log in page
    When the user enter valid username "Employee61"
    And the user enter valid password "Employee123"
    And the user clicks the log in button
    Then the user should be able to log in

  @validLoginWithParametres
  Scenario Outline: Login with valid credentials
    Given the user on the log in page
    When the user enter valid username "<username>"
    And the user enter valid password "<password>"
    And the user clicks the log in button
    Then the user should be able to log in

    Examples:
      | username      | password     |
      | Employee61    | Employee123  |
      | wrongUserName | Employee123  |
      | Employee61    | WrongPasword |
      | WrongUsername | WrongPasword |
      | empty         | empty        |
