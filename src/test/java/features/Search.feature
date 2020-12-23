Feature: Search Page


  Scenario: Search for items and validate results
    Given User is on GreenKart landing page
    When User searches for "Cucumber" vegetable
    Then "Cucumber" results are displayed

  @Regression
  Scenario Outline: Search for items and move to checkout page
    Given User is on GreenKart landing page
    When User searches for <Vegetable> vegetable
    And User adds <Qty> items to cart
    And User proceeds to checkout page
    Then Verify that <Qty> items of <Vegetable> items are displayed in checkout page
    Examples:
      |Vegetable  | Qty|
    |      Brinjal     |   3 |
    |      Brocolli          |   1  |