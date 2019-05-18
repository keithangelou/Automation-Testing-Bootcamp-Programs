Feature: Qualifications
  As an Admin
  I want to login to OrangeHRM Enterprise
  So that I can add skills on the qualifications page

  Scenario Outline: Login with valid credentials
    Given I am at the OrangeHRM home page
    When I enter "<username>" and "<password>"
    And I click on the login button
    And I click on the admin button
    And I click on the qualifications button
    And I click on the skills button
    And I click on the add button
    And I enter skills with "<name>" and "<description>"
    And I click on the save button
    Then I should see the skills

    Examples: 
      | username | password | name   | description    |
      | Admin    | admin123 | skill3 | this is skill3 |
