package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seamlessly_Login_Page {



    public Seamlessly_Login_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(id = "user")
    public WebElement userName;


@FindBy(id = "password")
    public WebElement password;


@FindBy(id = "submit-form")
    public WebElement loginButton;






}
