Feature: Add and delete products in the cart

  Scenario Outline:
    Given I am on the products page
    When I add a product "<product>" to the cart
    Then I should see "<product>" in the cart
    When I remove product "<product>" form the cart
    Then I should not see "<product>" in the cart

    Examples:
    |product |
    |Blue Top|
    |Tshirt  |