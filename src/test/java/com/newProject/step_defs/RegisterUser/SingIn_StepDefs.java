package com.newProject.step_defs.RegisterUser;

import com.newProject.pages.AccountPage;
import com.newProject.pages.BasePage;
import com.newProject.utilities.BrowserUtils;
import com.newProject.utilities.ConfigurationReader;
import com.newProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SingIn_StepDefs {

    BasePage basePage = new AccountPage();
    AccountPage accountPage = new AccountPage();


    @When("Enter the URL {string} and verify to URL")
    public void enter_the_URL_and_verify_to_URL(String expectedUrl) {

        Driver.get().get(ConfigurationReader.get("url"));

        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("Click on My Account Menu")
    public void click_on_My_Account_Menu() {

        basePage.baseMenu("My Account").click();
    }

    @Then("Enter registered {string} in Email-Address textBox")
    public void enter_registered_in_Email_Address_textBox(String string) {
        accountPage.register("reg_email").sendKeys(string);
    }

    @Then("Enter your own {string} in password textBox")
    public void enter_your_own_in_password_textBox(String string) {
        accountPage.register("reg_password").sendKeys(string);

    }

    @Then("Click on Register button")
    public void click_on_Register_button() {

        BrowserUtils.waitFor(5);
        accountPage.registerBtn.click();
    }

    @Then("User will be registered successfully and will be navigated to the Home page")
    public void user_will_be_registered_successfully_and_will_be_navigated_to_the_Home_page() {

        String actualName = accountPage.nameReader();
        String expectedName = accountPage.name();

        Assert.assertEquals(expectedName, actualName);

        basePage.websiteIcon.click();
    }
}
