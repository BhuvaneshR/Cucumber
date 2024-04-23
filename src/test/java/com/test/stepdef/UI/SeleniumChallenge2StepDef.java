package com.test.stepdef.UI;

import com.test.pages.IFastPage;
import com.test.pages.IWikiPage;
import com.test.pages.implimentations.FastPageImpl;
import com.test.pages.implimentations.WikiPageImpl;
import com.test.utilities.BasePageObject;
import com.test.utilities.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumChallenge2StepDef extends BasePageObject {
    private static final Logger logger= LoggerFactory.getLogger(SeleniumChallenge2StepDef.class);
    IWikiPage wPage;
    WebDriver driver;


    @When("search for text {string}")
    public void search_for_text(String keyword) {
        driver = WebDriverManager.getDriver();
        wPage = new WikiPageImpl(driver);
        wPage.searchForKeywordInWiki(keyword);
    }

    @Then("verifies the result {string}")
    public void verifies_the_result(String expectedHeader) {
        Assert.assertEquals(expectedHeader,wPage.getSearchResultPageTitle());
    }

}