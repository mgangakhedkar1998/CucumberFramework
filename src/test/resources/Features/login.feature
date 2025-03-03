Feature: login functionality

  Background:
    Given user should be on login page


  Scenario: valid login
    When user enters valid credentials
    Then user should navigate to home page
    And user can see logout link
    And close browser


  Scenario: invalid login
    When user enters invalid credentials
    Then user should be on same page
    And user can see error message
    And close browser

  @modi
  Scenario Outline: invalid login with data driven
    When user enters invalid credentials user mane as "<userid>" and password as "<password>"
    Then user should be on same page
    And user can see error message
    And close browser
    Examples:
    | userid | password |
    | ad1    | pw1      |
    | ad2    | pw2      |


