Feature: Purchase process
  Background:
    Given I am on the home page for purchase
    And I log in with username "got.test.06@gmail.com" and password "Password@1"

  Scenario: Complete a purchase successfully
    When I add a product to the cart
    And I proceed to checkout
    And I review your order add the comment "All that is ok"
    And I enter the payment data
    Then I should see the confirmation message "ORDER PLACED!"