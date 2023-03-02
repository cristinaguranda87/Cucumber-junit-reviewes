package com.cydeo.pages.librarian_;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class Librarian_BasePage {
    // parent of other POM in the project/application
    // most of the time we can make this page abstract,

public Librarian_BasePage() {
     PageFactory.initElements(Driver.getDriver(), this);
    }

// create a method to navigate to different tabs in main Page
// comon locator is       ://span[.='Users/Dashbord/Books']

 public void navigateTo(String page) {
    WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='" + page + "']"));
    linkToPage.click();






    }




}
