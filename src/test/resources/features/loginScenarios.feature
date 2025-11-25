Feature: Login with valid and invalid credentials

  Scenario Outline: The user try to login with different credentials
    Given I am on the page
    When I enter with userEmail "<username>" and Pass "<password>"
    Then I should see a message "<message>"

    Examples:
      |username| password|message|
      |test@mail.es | password |Your email or password is incorrect!|
      |got.test.06@gmail.com | Password@1 |Logged in as|
