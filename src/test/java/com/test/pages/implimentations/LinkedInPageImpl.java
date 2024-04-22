package com.test.pages.implimentations;

import com.test.pages.ILinkedInPage;
import com.test.pages.IWikiPage;
import com.test.utilities.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedInPageImpl extends BasePageObject implements ILinkedInPage {

	private final WebDriver driver;
	private final Logger logger=LoggerFactory.getLogger(LinkedInPageImpl.class);

	public LinkedInPageImpl(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@Override
	public String getLinkedPageTitle(){
		return driver.getTitle();
	}






}