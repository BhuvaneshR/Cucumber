package com.test.pages;

import com.test.utilities.BasePageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePageObject {
	private WebDriver driver;
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="textarea[aria-label='Search']")
	public WebElement searchBar;

	@FindBy(css="center input[aria-label='Google Search']:first-of-type")
	public WebElement searchButton;

	public void sendKeystoSearchBar(String input)
	{
		searchBar.sendKeys(input);
	}

	public void clickSearchBtn()
	{
		jsClick(driver, searchButton);
	}




}