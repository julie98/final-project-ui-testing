Feature: admin user login
  Scenario: Login as an admin
    Given I visit the login page
    When I enter the username "yulinhe"
    And I enter the password "Edison980522"
    And I click the login button
    Then I should be able to see the dashboard page
