package com.test.utilities;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverManager {
	private static WebDriver driver;
	private static Logger logger= LoggerFactory.getLogger(WebDriverManager.class);

	public static void initializeDriver(){
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "/Users/rbhuvanesh/IdeaProjects/Cucumber/drivers/chromedriver_122/chromedriver");
//			ChromeOptions co = new ChromeOptions();
//			co.setBinary("/Users/rbhuvanesh/Documents/ChromeDriver/chrome/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
			driver = new ChromeDriver();
			logger.info("The driver has been initiated.");
		}
	}
	public static WebDriver getDriver(){
		if(driver==null)
		{
			initializeDriver();
		}
		return driver;
	}

	public static void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
			logger.info("The driver has been quit.");
			driver=null;
		}
	}

	public static void closeDriver()
	{
		if(driver!=null)
		{
			driver.close();
			logger.info("The driver has been closed.");
		}
	}

}