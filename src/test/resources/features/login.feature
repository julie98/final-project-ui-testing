Feature: admin user login
  Scenario: Login as an admin
    Given I visit the login page
    When I enter the username "username"
    And I enter the password "password"
    And I click the login button
    Then I should be able to see the dashboard page
