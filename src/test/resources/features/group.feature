Feature: Group Management
  Background:
    Given I visit the login page
    When I enter the username "haoyu"
    And I enter the password "12345"
    And I click the login button
    Then I should be able to see the dashboard page
    And click user management
    And acquire admin authority with "12345"
    Then at user browser page

  Scenario:
    When login as admin for group
    And create group
    And add user "Sage" to group
    Then get user with group filter