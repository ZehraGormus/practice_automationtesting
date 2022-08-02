@register_EmptyPassword
Feature: Register User with empty password

  Scenario: the user enters the valid email and empty password
    Given Enter the URL "https://practice.automationtesting.in/" and verify to URL
    Then Click on My Account Menu
    Then Enter valid "cucumber_auto@gmail.com" in Email-Address textBox
    Then Enter empty "" in password textBox
    Then Click on Register button
    And Registration should fail with a warning message " Please enter an account password."