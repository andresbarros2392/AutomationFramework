Feature: Account Page

  @Regression
  Scenario: User is able to open an account
    Given I login into the app with "username" username and "password" password
    When I navigate to homepage
    Then I should be able to see all my accounts
    When I click on any account
    Then I should be able to see account details
