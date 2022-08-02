package com.newProject.step_defs.RegisterUser;

import com.newProject.pages.AccountPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class InvalidEmail_StepDefs {

    AccountPage accountPage = new AccountPage();

    @Then("Enter invalid {string} in Email-Address textBox")
    public void enter_invalid_in_Email_Address_textBox(String email) {

        accountPage.register("reg_email").sendKeys(email);
    }

    @Then("Registration should fail with a warning message {string}")
    public void registration_should_fail_with_a_warning_message(String expectedTextError) {

        String actualTextError = accountPage.errorValidEmail.getText().substring(6); // --> substring() kullandik cunku, Error: ile birlikte yazdiriyordu.

        Assert.assertEquals(expectedTextError,actualTextError);
    }

}
