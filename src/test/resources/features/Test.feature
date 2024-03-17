@Google
Feature: To launch google.com using selenium

  @Scenario1 @UITest
  Scenario Outline: Launch Google.com and Search for a Name
    Given user launches "<URL>"
    When user enters his name "<Name>"
    And clicks on search button
    Then this linked profile is visible

    Examples:
      | URL                     | Name              |
      | https://www.google.com/ | Bhuvanesh Ravilla LinkedIn |
      | https://www.google.com/ | Reshma J LinkedIn      |
