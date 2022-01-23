@Google
Feature: To launch google.com using selenium

  @Scenario1
  Scenario Outline: Launch google.com
    Given user launches "<URL>"
    When user enters his name "<Name>"
    And clicks on search button
    Then this linked profile is visible

    Examples: 
      | URL                     | Name              |
      | https://www.google.com/ | Bhuvanesh Ravilla |
      | https://www.google.com/ | i      |
