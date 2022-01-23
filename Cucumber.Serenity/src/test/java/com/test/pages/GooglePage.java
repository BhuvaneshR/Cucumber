package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	public WebDriver driver;
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	public WebElement searchBar;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
	public WebElement searchButton;
	
	public void sendKeystoSearchBar(String input)
	{
		searchBar.sendKeys(input);
	}
	
	public void clickSearchBtn()
	{
		searchButton.click();
	}
	
	
	

}
