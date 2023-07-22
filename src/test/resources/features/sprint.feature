# Created by yulin at 7/20/23
Feature: Sprint Management - team leader
  # Enter feature description here

  Scenario: Login as a team leader
    Given I visit the dashboard page
    When I click the project button
    And I click the project
    Then I am at the project page
    When I click the backlog button
    And I click create sprint
    And I enter the sprint name "A new Sprint"
    And I enter the goal of this sprint "Goal of the new sprint"
    Then I finish creating the sprint
    When I drag the issue to the sprint
    And I start the sprint
    Then the sprint should be started
    Given the scrum board page
    When I click Complete sprint button
    And click Complete to confirm
    Then the current sprint is closed and I can see the sprint report
    When I click switch report button
    And I click Velocity Report
    Then I can download velocity report



