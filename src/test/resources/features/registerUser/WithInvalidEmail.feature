@register_InvalidEmail
Feature: Register User with invalid email and valid password

  Scenario: the user enters the invalid email and valid password
    Given Enter the URL "https://practice.automationtesting.in/" and verify to URL
    Then Click on My Account Menu
    Then Enter invalid "cucumber_auto_07@sdfgsdfg" in Email-Address textBox
    Then Enter your own "automation.cucumber07070" in password textBox
    Then Click on Register button
    And Registration should fail with a warning message " Please provide a valid email address."