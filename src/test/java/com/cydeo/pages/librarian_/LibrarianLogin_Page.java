package com.cydeo.pages.librarian_;

import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.bouncycastle.cms.RecipientId.password;

public class LibrarianLogin_Page extends Librarian_BasePage {


    @FindBy(css = "#inputEmail")
    public WebElement emailBox;


    @FindBy(css = "#inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;


   public void login(String user) {
       String userEmail = ConfigurationReader.getProperty(user + "_username");
       String userPassword = ConfigurationReader.getProperty(user + "_password");
       emailBox.sendKeys(userEmail);
       passwordBox.sendKeys(userPassword);
       signInBtn.click();
   }
       public void login(String userName, String password){
           emailBox.sendKeys(userName);
           passwordBox.sendKeys(password);
           signInBtn.click();


       }

}