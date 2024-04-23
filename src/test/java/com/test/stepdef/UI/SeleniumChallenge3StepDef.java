package com.test.stepdef.UI;

import com.test.pages.ILinkedInPage;
import com.test.pages.IWikiPage;
import com.test.pages.implimentations.LinkedInPageImpl;
import com.test.pages.implimentations.WikiPageImpl;
import com.test.utilities.BasePageObject;
import com.test.utilities.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumChallenge3StepDef extends BasePageObject {


    private static final Logger logger= LoggerFactory.getLogger(SeleniumChallenge3StepDef.class);
    ILinkedInPage lPage;
    WebDriver driver;

    @Then("verifies the page title to be {string}")
    public void verifies_the_page_title_to_be(String expectedPageTitle) {
        driver = WebDriverManager.getDriver();
        lPage = new LinkedInPageImpl(driver);
        Assert.assertEquals(expectedPageTitle,lPage.getLinkedPageTitle());
    }
}