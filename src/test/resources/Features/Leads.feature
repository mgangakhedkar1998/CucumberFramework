Feature: Lead functionality

  Background:
    Given user should be on login page
    When user enters valid credentials

    @cl
    Scenario Outline: Create Lead
      When user click on new lead link
      And fill mandatory fields lastname"<lastname>" and Company "<comp>"click save button
      Then Lead  should created successfully
      And close browser
      Examples:
      | lastname | comp |
      | Shah     | BJP  |
      | Shinde   | Sena |
