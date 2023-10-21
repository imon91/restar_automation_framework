Feature:  User creates a new GitHub issue
  @smoke
  Scenario Outline:
    Given user is on the GitHub website
    When navigates to the repository '<repoName>'
    And clicks on the issue tab
    And selects new issue
    And fills in the issue title as '<newIssue>'
    And adds a '<description>'
    And submits the issue
    Then the issue should be created successfully
    Examples:
    |repoName|newIssue|description|
    |restar_automation_framework| new issue | not working|

