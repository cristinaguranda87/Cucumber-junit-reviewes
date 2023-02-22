package com.cydeo.step_definitions;

import com.cydeo.pages.ButtonsPages;
import com.cydeo.pages.DemoQa_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class DemoQA_StepDefinitions {

        ButtonsPages buttonsPages= new ButtonsPages();
     DemoQa_Page demoQa_page=new DemoQa_Page();
     Actions actions = new Actions(Driver.getDriver());


    @Given("Navigate to {string} page")
    public void navigate_to_page(String option) {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoQAURL"));
        demoQa_page.clickOption(option);

    }
    @When("Double click on button")
    public void double_click_on_button() {
    actions.doubleClick(buttonsPages.doubleClickMe).perform();

    }
    @Then("Verify text double click message {string} should be visible")
    public void verify_text_double_click_message_should_be_visible(String expectedMessage) {
    Assert.assertEquals(expectedMessage,buttonsPages.doubleClickMessageYouHave.getText());


    }
    @Then("Right click on button")
    public void right_click_on_button() {
        actions.contextClick(buttonsPages.rightClickMe).perform();

    }
    @Then("Verify text right click message {string} should be visible")
    public void verify_text_right_click_message_should_be_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPages.rightClickMessageYouHave.getText());
    }
    @Then("Click Me button")
    public void click_me_button() {
        buttonsPages.clickMe.click();
    }
    @Then("Verify text click me message {string} should be visible")
    public void verify_text_click_me_message_should_be_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPages.dynamicClickMessageYouHave.getText());
    }
}
