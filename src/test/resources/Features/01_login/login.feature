Feature: GitHub Login
  @smoke
  Scenario Outline:Successful login to GitHub
    Given I am on the GitHub login page
    When I enter my GitHub '<username>' and '<password>'
    And I click the  button
    Then I should be logged into my GitHub account
    Examples:
    |username|  password|
    |imon91  | imon224087|
