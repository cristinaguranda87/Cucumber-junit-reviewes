
Feature:Librarian User Adding Feature
  As a librarian, I should be able to add new user into library

   @wip
 Scenario: Verify added user able to login libraryApp

    Given the "librarian" on the home page
    And the librarian navigates to "Users" page
    When the librarian clicks to Add User
    And the librarian enters fullname "Test-Cristina"
    When the librarian enters password "Test1234!"
    And the librarian enters email "test-cristina@test.com"
    And the librarian clicks to save changes
    Then verify "The user has been created" message is displayed
    And verify created user with "test-cristina@test.com" and "Test1234!" able to login
    And verify created user should be able to see "Test-Cristina"
#    And created user should be deleted from library

