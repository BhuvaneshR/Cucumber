package com.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateDriver {
	
	public static WebDriver createDriverInstance()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Fiserv_User_333330/git/Cucumber.Serenity/drivers/chromedriver_96.0.4664.45/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		@SuppressWarnings("deprecation")
//		WebDriverWait wait=new WebDriverWait(driver,10);
		return driver;
	}

}
