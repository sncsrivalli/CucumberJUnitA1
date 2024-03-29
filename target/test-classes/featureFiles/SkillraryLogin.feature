Feature: Skillrary demo app login

  Background: 
    Given I enter to login page

  Scenario: Login to skillrary demo app with valid credentials
    When I provide valid credentials
    And I hit on login
    Then I should navigate to home page

  Scenario Outline: Login to skillrary with multiple credentials
    When I provide <username> and <password>
    And I hit on login
    Then I should navigate to home page

    Examples: 
      | username | password |
      | admin    | admin    |
      | user     | user     |
      | abcdef   |   123456 |
