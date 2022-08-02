package com.newProject.pages;

import com.newProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
        //bu kod blogu findElement sürekli cagirmadan islem yapmamiza olanak tanir ve @FindBy kullanmamizi saglar vede WebElement in calismasini saglar
        //bu sayfadaki element ve methodlari kullanmamiza yariyor.
    }


    @FindBy(xpath = "//img[@title='Automation Practice Site']")
    public WebElement websiteIcon;

    public WebElement baseMenu(String text){

        return Driver.get().findElement(By.xpath("//a[normalize-space()='"+text+"']"));
    }



}
