Feature: Login Page

  @Regression
  Scenario: User is able to login successfully
    Given I login into the app with "username" username and "password" password
    When I navigate to homepage
    Then I should be able to see all my accounts

  @Smoke
  Scenario: User is able to login successfully with another user
    Given I login into the app with "Pedro" username and "Perez" password
    When I navigate to homepage
    Then I should be able to see all my accounts

  @Regression
  Scenario: User is able to sign up with the correct information
    Given I navigate to sign up page
    When User sign up with the right info
    | Andres | abcd | andres@bar.com | Argentina | 261262126|
    When I navigate to homepage
    Then I should be able to see all my accounts

  @Smoke
  Scenario Outline: User is able to login with many users
    Given I navigate to sign up page
    When I login into the app with "<Username>" username and "<Password>" password
    When I navigate to homepage
    Then I should be able to see all my accounts
    Examples:
      | Username  | Password |
      |  user1    | pass1    |
      |  user2    | pass2    |
      |  user3    | pass3    |