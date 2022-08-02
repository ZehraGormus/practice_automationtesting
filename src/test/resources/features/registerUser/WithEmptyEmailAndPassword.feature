@register_EmptyEmailAndPassword
Feature: Register User with empty email and password

  Scenario: the user enters the empty email and password
    Given Enter the URL "https://practice.automationtesting.in/" and verify to URL
    Then Click on My Account Menu
    Then Enter empty "" in Email-Address textBox
    Then Enter empty "" in password textBox
    Then Click on Register button
    And Registration should fail with a warning message " Please provide a valid email address."