package com.cydeo.step_definitions;

import com.cydeo.pages.librarian_.LibrarianLogin_Page;
import com.cydeo.pages.librarian_.User_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Librarian_Step_Definitions {

    LibrarianLogin_Page librarianLogin_page= new LibrarianLogin_Page();
    User_Page user_page= new User_Page();

    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
        librarianLogin_page.login(user);

    }
    @Given("the librarian navigates to {string} page")
    public void the_librarian_navigates_to_page(String page) {
        librarianLogin_page.navigateTo(page);

    }
    @When("the librarian clicks to Add User")
    public void the_librarian_clicks_to_add_user() {
        user_page.addUser.click();
    }
    @When("the librarian enters fullname {string}")
    public void the_librarian_enters_fullname(String fullname) {
    user_page.fullName.sendKeys(fullname);

    }
    @When("the librarian enters password {string}")
    public void the_librarian_enters_password(String password) {
    user_page.password.sendKeys(password);
    }
    @When("the librarian enters email {string}")
    public void the_librarian_enters_email(String email) {
    user_page.email.sendKeys(email);
    }
    @When("the librarian clicks to save changes")
    public void the_librarian_clicks_to_save_changes() {
    user_page.saveChanges.click();
        BrowserUtils.sleep(2);
    }
    @Then("verify {string} message is displayed")
    public void verify_message_is_displayed(String message) {
        Assert.assertEquals(message,user_page.message.getText());
        Assert.assertTrue(user_page.message.isDisplayed());

    }
    @Then("verify created user with {string} and {string} able to login")
    public void verify_created_user_with_and_able_to_login(String userName, String password) {
        BrowserUtils.waitForInvisibilityOff(user_page.message);
        user_page.accountHolderName.click();
        user_page.logOutLink.click();
        BrowserUtils.sleep(2);
        librarianLogin_page.login(userName,password);

    }
    @Then("verify created user should be able to see {string}")
    public void verify_created_user_should_be_able_to_see(String expectedName) {
        BrowserUtils.sleep(2);

    Assert.assertEquals(expectedName,user_page.accountHolderName.getText());
    }
}
