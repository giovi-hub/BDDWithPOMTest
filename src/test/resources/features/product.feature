Feature: Add product to cart

  Scenario: Add product correctly to the cart
    Given I am on the home page
    When I add the first product to the cart
    Then I should see the message of product added in the cart
