@APITesting
Feature: To Automate REST APIs

  @getList @APITest
  Scenario: Scenario to get List of users
    Given user creates the request
    When user hits the endpoint with request
    Then user must be able see status code <200>