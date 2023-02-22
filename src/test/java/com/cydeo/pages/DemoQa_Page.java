package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQa_Page {

// we add the constructor only when we use @Find
    public void clickOption(String option) {
        String locator = "//li[.='" + option + "']";
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}






