package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface IFastPage {


    WebElement speedMessage = null;
    WebElement speedValue = null;


    void waitForSpeedAnalysisCompletion();
    void logSpeed();

}
