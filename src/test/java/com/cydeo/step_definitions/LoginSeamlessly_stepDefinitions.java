package com.cydeo.step_definitions;

import com.cydeo.pages.Seamlessly_Login_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSeamlessly_stepDefinitions {

    Seamlessly_Login_Page seamlesslyLoginPage = new Seamlessly_Login_Page();

    @Given("the user on the log in page")
    public void the_user_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamleasslyURL"));
    }

    @When("the user enter valid username")
    public void the_user_enter_valid_username() {
        seamlesslyLoginPage.userName.sendKeys(ConfigurationReader.getProperty("seamlesslyUsername"));

    }

    @When("the user enter valid password")
    public void the_user_enter_valid_password() {
        seamlesslyLoginPage.password.sendKeys(ConfigurationReader.getProperty("seamlesslyPassword"));


    }

    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
        seamlesslyLoginPage.loginButton.click();

    }

    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("seamlessly"));
    }


    @When("the user enter valid password {string}")
    public void the_user_enter_valid_password_With_Param(String password) {
        if (password.equals("empty")) {
            seamlesslyLoginPage.password.sendKeys("");
        } else {
            seamlesslyLoginPage.password.sendKeys(password);
        }
    }

    @When("the user enter valid username {string}")
    public void the_user_enter_valid_username_With_Param(String username) {
        if (username.equals("empty")) {
            seamlesslyLoginPage.userName.sendKeys("");
        } else {
            seamlesslyLoginPage.userName.sendKeys(username);

        }
    }
}