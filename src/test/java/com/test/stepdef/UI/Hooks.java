package com.test.stepdef.UI;

import com.test.utilities.CreateDriver;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.test.utilities.BasePageObject;

import io.cucumber.java.After;
import io.cucumber.java.Before;

@RunWith(Cucumber.class)
public class Hooks extends BasePageObject {

    private static WebDriver driver;

    @Before("@UITest")
    public void initDriver()
    {
        System.out.println("Reached Before in Hooks");
        CreateDriver driverObj=new CreateDriver();
        driver=driverObj.setDriver();
    }
    @After("@UITest")
    public void closeDriver() {
        System.out.println("Reached After in Hooks");
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}