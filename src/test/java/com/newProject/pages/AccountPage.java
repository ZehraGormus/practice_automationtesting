package com.newProject.pages;

import com.newProject.utilities.ConfigurationReader;
import com.newProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(name = "register")
    public WebElement registerBtn;

    @FindBy(xpath = "//div[@id='body']//li[1]")
    public WebElement errorValidEmail;


    public WebElement register(String id){

        return Driver.get().findElement(By.id(id));
    }

    public String nameReader(){
        WebElement element = Driver.get().findElement(By.xpath("//strong[normalize-space()='"+name()+"']"));
        return element.getText();
    }

    public String name(){ // --> bu method defauld olarak gelen name dynamic olarak bize veriyor.
        String email = ConfigurationReader.get("email");
        String name = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){

                name = email.substring(0,i);
            }
        }
        return name;
    }

}
