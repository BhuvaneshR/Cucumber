package com.test.pages.implimentations;

import com.test.pages.IFastPage;
import com.test.utilities.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FastPageImpl extends BasePageObject implements IFastPage {
	private WebDriver driver;
	public FastPageImpl(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="textarea[aria-label='Search']")
	public WebElement searchBar;

	@FindBy(css="center input[aria-label='Google Search']:first-of-type")
	public WebElement searchButton;
	@Override
	public void sendKeystoSearchBar(String input)
	{
		searchBar.sendKeys(input);
	}
	@Override
	public void clickSearchBtn()
	{
		jsClick(driver, searchButton);
	}




}