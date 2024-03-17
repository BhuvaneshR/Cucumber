package com.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateDriver {
	private static WebDriver driver;
	public static WebDriver setDriver(){
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "/Users/rbhuvanesh/IdeaProjects/Cucumber/drivers/chromedriver_122/chromedriver");
			ChromeOptions co = new ChromeOptions();
			co.setBinary("/Users/rbhuvanesh/Documents/ChromeDriver/chrome/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
			driver = new ChromeDriver();
		}
		return driver;
	}

}