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

  @Challenge4 @Challenge5 @UITest
  Scenario Outline: Create a script to handle browser windows and pop-ups in Selenium & Write a script to perform mouse hover actions on a web element using Selenium
    Given user launches "<URL>"
    And logs in with "<UserName>" and "<Password>"
    When User expand the User dropdown and clicks on Developer console
    And Switch to the new window
    And click on Help Docs
    And Switch to the new tab
    Then Verify the login button visibility
    When hover on login button
    Then verify the text on the hover
    And Switch back to the New Window to close it
    And Navigate back to Parent window

    Examples:
      | URL                   |UserName |Password
      | https://login.salesforce.com/ |slekkala@int.com |Welcome1234|