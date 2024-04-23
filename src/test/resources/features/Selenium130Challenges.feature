Feature: To automate 130 challenges in Selenium using Java and Cucumber

  @Challenge1 @UITest
  Scenario Outline: Write a Selenium script to launch a browser and navigate to a specific URL
    Given user launches "<URL>"
    When user checks for internet speed

    Examples:
      | URL                   |
      | https://www.fast.com/ |

  @Challenge2 @UITest
  Scenario Outline: Write a script to locate and interact with a web element on a webpage using Selenium
    Given user launches "<URL>"
    When search for text "Selenium"
    Then verifies the result "Selenium"

    Examples:
      | URL                   |
      | https://www.wikipedia.org/ |

  @Challenge3 @UITest
  Scenario Outline: Implement a test case to verify the title of a webpage using Selenium
    Given user launches "<URL>"
    Then verifies the page title to be "LinkedIn: Log In or Sign Up"

    Examples:
      | URL                   |
      | https://www.linkedin.com/ |