package com.test.utilities;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Set;

public class BasePageObject {
	private static final Logger logger= LoggerFactory.getLogger(BasePageObject.class);
	public static void getURL(WebDriver driver, String URL)
	{
		if (driver == null) {
			throw new NullPointerException("WebDriver instance is not initialized in Hooks Class");
		}
		driver.get(URL);
		driver.manage().window().maximize();
	}


	public static void jsClick(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}
	public static void clearCookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}
	public static void waitForElementToBeVisible(WebDriver driver, WebElement locator, int timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public static void waitForPageToLoad(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
	}

}