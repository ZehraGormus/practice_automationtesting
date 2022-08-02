@register_EmptyEmail
Feature: Register User with empty email

  Scenario: the user enters the empty email and valid password
    Given Enter the URL "https://practice.automationtesting.in/" and verify to URL
    Then Click on My Account Menu
    Then Enter empty "" in Email-Address textBox
    Then Enter your own "automation.cucumber07070" in password textBox
    Then Click on Register button
    And Registration should fail with a warning message " Please provide a valid email address."