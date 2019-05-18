Feature: Login
  As an Admin
  I want to login to OrangeHRM Enterprise
  So that I can access my dashboard

  Scenario Outline: Login with valid credentials
    Given I am at the OrangeHRM home page
    When I enter "<username>" and "<password>"
    And I click on the login button
    Then I should see the welcome page

    Examples: 
      | username | password |
      | sysadmin | sysadmin |
      | admin    | admin    |
      | Admin    | admin123 |
