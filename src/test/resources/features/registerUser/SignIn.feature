@register_SingIn
Feature: Register User SingIn

  Scenario: the user should be able to signIn

    Given Enter the URL "https://practice.automationtesting.in/" and verify to URL
    Then Click on My Account Menu
    Then Enter registered "cucumber_auto_07@gmail.com" in Email-Address textBox
    Then Enter your own "automation.cucumber07070" in password textBox
    Then Click on Register button
    And User will be registered successfully and will be navigated to the Home page
