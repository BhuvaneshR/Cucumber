package com.test.stepdef.UI;

import com.test.pages.ISalesForce;
import com.test.utilities.BasePageObject;
import com.test.utilities.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SalesForceStepDef extends BasePageObject {

    WebDriver driver;
    ISalesForce sf;


    @Given("logs in with {string} and {string}")
    public void logs_in_with(String username, String password) {

        driver= WebDriverManager.initializeDriver();
        sf.

    }

    @When("User expand the User dropdown and clicks on Developer console")
    public void user_expand_the_user_dropdown_and_clicks_on_developer_console() {
        
    }
    @When("Switch to the new window")
    public void switch_to_the_new_window() {
        
    }
    @When("click on Help Docs")
    public void click_on_help_docs() {
        
    }
    @When("Switch to the new tab")
    public void switch_to_the_new_tab() {
        
    }
    @Then("Verify the login button visibility")
    public void verify_the_login_button_visibility() {
        
    }
    @When("hover on login button")
    public void hover_on_login_button() {
        
    }
    @Then("verify the text on the hover")
    public void verify_the_text_on_the_hover() {
        
    }
    @Then("Switch back to the New Window to close it")
    public void switch_back_to_the_new_window_to_close_it() {
        
    }
    @Then("Navigate back to Parent window")
    public void navigate_back_to_parent_window() {
        
    }
}