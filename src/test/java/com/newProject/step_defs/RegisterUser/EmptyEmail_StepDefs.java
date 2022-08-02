package com.newProject.step_defs.RegisterUser;

import com.newProject.pages.AccountPage;
import io.cucumber.java.en.Then;

public class EmptyEmail_StepDefs {

    AccountPage accountPage = new AccountPage();

    @Then("Enter empty {string} in Email-Address textBox")
    public void enter_empty_in_Email_Address_textBox(String email) {

        accountPage.register("reg_email").sendKeys(email);
    }
}
