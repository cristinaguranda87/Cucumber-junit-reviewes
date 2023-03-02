package com.cydeo.pages.librarian_;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Librarian_BasePage {
    // parent of other POM in the project/application
    // most of the time we can make this page abstract,

    public Librarian_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }




}
