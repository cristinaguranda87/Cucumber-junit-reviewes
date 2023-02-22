package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://demoqa.com/buttons
public class ButtonsPages {

    public ButtonsPages() {
PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy(xpath = "//*[@id='doubleClickBtn']")
        public WebElement doubleClickMe;

        @FindBy(css = "button[id='rightClickBtn']")
        public WebElement rightClickMe;

        @FindBy(xpath = "//*[.='Click Me']")
        public WebElement clickMe;

        @FindBy(xpath = "//*[@id='doubleClickMessage']")
        public WebElement doubleClickMessageYouHave;

        @FindBy(xpath = "//*[@id='rightClickMessage']")
        public WebElement rightClickMessageYouHave;

    @FindBy(xpath = "//*[@id='dynamicClickMessage']")
    public WebElement dynamicClickMessageYouHave;

    }

