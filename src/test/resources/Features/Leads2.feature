Feature: Lead 2 functionality

  @cl2
  Scenario: Create Lead step parameterization
    Given user should be on login
    When user enters valid credentials
    And user create a lead with data and verify successful lead creation
      |Shah  | BJP  |
      |Gupta | BJP  |
      |Gandhi| congress|
      |Kohli |India    |
    And close browser

