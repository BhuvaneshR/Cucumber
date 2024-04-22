package com.test.stepdef.UI;

import com.test.pages.IFastPage;
import com.test.utilities.WebDriverManager;
import org.openqa.selenium.WebDriver;

import com.test.pages.implimentations.FastPageImpl;
import com.test.utilities.BasePageObject;

import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumChallengesStepDef extends BasePageObject {
    private static final Logger logger= LoggerFactory.getLogger(SeleniumChallengesStepDef.class);
    IFastPage gpage;
    WebDriver driver;

    @Given("user launches {string}")
    public void user_launches(String URL) {
        driver = WebDriverManager.getDriver();
        getURL(driver,URL);
        gpage = new FastPageImpl(driver);
    }

    @When("user checks for internet speed")
    public void user_enters_his_name() {
        gpage.waitForSpeedAnalysisCompletion();
        gpage.logSpeed();
    }


}