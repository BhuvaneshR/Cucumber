package com.test.utilities;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class WebDriverManager {
	private static WebDriver driver=null;
	private static final Logger logger= LoggerFactory.getLogger(WebDriverManager.class);

	public static void initializeDriver(){
		String browserName=Config.getConfigProperty("Browser");
		if(driver == null && browserName.equals("Chrome")) {
			String userPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", userPath+"/drivers/chromedriver_122/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // This is the old syntax before Selenium 4.0 --> driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			logger.info("The chrome driver has been initiated.");
		}
	}
	public static WebDriver getDriver(){
		if(driver==null)
		{
			initializeDriver();
		}
		else
		{
			logger.info("Driver is already been instantiated, only returning the driver instance now");
		}
		return driver;
	}

	public static void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
			logger.info("The driver has been quit");
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