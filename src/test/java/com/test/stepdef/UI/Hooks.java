package com.test.stepdef.UI;

import com.test.utilities.WebDriverManager;
import io.cucumber.java.*;

import com.test.utilities.BasePageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks extends BasePageObject {

    private static Logger logger= LoggerFactory.getLogger(Hooks.class);
    @Before("@UITest")
    public static void setUp(Scenario scenario)
    {
        logger.info("Reached Before in Hooks");
        WebDriverManager.getDriver();
    }
    @After("@UITest")
    public static void tearDown(Scenario scenario) {
        logger.info("Reached After in Hooks");
        WebDriverManager.quitDriver();
    }
}