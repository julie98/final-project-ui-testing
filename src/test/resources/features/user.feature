Feature: manage user
  Background:
    Given I visit the login page
    When I enter the username "haoyu"
    And I enter the password "12345"
    And I click the login button
    Then I should be able to see the dashboard page
    And click user management
    And acquire admin authority with "12345"


  Scenario: Create User
    And at user browser page
    And Create user

  Scenario: deactive user
    And edit user to inactive
    And apply User inacitve filter
    Then I can find the user with username "sageDemo"
    And logout
    Given I visit the login page
    When I enter the username "sageDemo"
    And I enter the password "123456Demo"
    Then login failed

  Scenario: add user to groups
    When I choose user
    And click manage groups
    And type groups and add group



