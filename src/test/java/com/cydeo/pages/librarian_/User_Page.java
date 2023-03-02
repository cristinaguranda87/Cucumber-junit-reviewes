package com.cydeo.pages.librarian_;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Page extends Librarian_BasePage{



  @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUser;

  @FindBy(xpath = "//input[@name='full_name']")
  public WebElement fullName;

  @FindBy(xpath = "//input[@name='password']")
  public WebElement password;


  @FindBy(xpath = "//input[@name='email']")
  public WebElement email;

  @FindBy(xpath = "//button[.='Save changes']")
  public WebElement saveChanges;


  @FindBy(css="div.toast-message")
  public WebElement message;

@FindBy(partialLinkText = "Log Out")
public WebElement logOutLink;

  @FindBy(css = "#navbarDropdown>span")
  public WebElement accountHolderName;


}
