Feature: Project Management with workflow

  Scenario:
    Given I Login to the application
    When Create a new project
    Then Verify the project is created successfully
    When I click the admin button
    And I click the issue button
    And I click the workflows
    And I click the add workflow button
    And I enter the workflow name and description
    Then I should able to add all the status
    And I should able to add all the transitions
    When I click the workflow scheme button
    Then I should able to assign created workflow to the project
    When I click create issue button
    Then I should able to create Epic issue with the workflow
    And I should able to create Story issue with the workflow
    When I click current project button
    Then I should able to create new board
    And I should able to create new sprint
    And I can see the active sprint I can switch issue in the column





