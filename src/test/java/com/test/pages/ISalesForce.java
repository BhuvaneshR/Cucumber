package com.test.pages;

import org.openqa.selenium.WebElement;

public interface ISalesForce {


    WebElement speedMessage = null;
    WebElement speedValue = null;


    void waitForSpeedAnalysisCompletion();
    void logSpeed();

}
