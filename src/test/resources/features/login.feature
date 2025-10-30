Feature: Login

  Scenario: Login with valid credentials
    Given I am on the login page
    When I login with username "got.test.06@gmail.com" and password "Password@1"
    Then I should see "Logged in as gio" in the menu
