Feature: Login

  Scenario: Login with valid credentials
    Given I am on the login page
    When I login with username "got.test.06@gmail.com" and password "Password@1"
    Then I should see "Logged in as gio" in the menu

    Scenario: Login with invalid credentials
      Given I am on the login page
      When I login with username "giovi@mail.com" and password "password"
      Then I should see "Your email or password is incorrect!" in the login form

