package com.newProject.step_defs.RegisterUser;

import com.newProject.pages.AccountPage;
import io.cucumber.java.en.Then;

public class EmptyPassword_StepDefs {

    AccountPage accountPage = new AccountPage();

    @Then("Enter valid {string} in Email-Address textBox")
    public void enter_valid_in_Email_Address_textBox(String email) {

        accountPage.register("reg_email").sendKeys(email);
    }

    @Then("Enter empty {string} in password textBox")
    public void enter_empty_in_password_textBox(String password) {

        accountPage.register("reg_password").sendKeys(password);
    }

}
