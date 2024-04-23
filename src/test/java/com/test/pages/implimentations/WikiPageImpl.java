package com.test.pages.implimentations;

import com.test.pages.IFastPage;
import com.test.pages.IWikiPage;
import com.test.utilities.BasePageObject;
import com.test.utilities.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WikiPageImpl extends BasePageObject implements IWikiPage {

	private final WebDriver driver;
	private final Logger logger = LoggerFactory.getLogger(WikiPageImpl.class);
	@FindBy(id = "searchInput")
	public WebElement wikiSearchInputBox;

	@FindBy(css = "button.pure-button")
	public WebElement searchBtn;

	@FindBy(css = ".mw-page-title-main")
	public WebElement pageHeaderTitle;

	public WikiPageImpl(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@Override
	public void searchForKeywordInWiki(String searchKeyword){
		wikiSearchInputBox.sendKeys(searchKeyword);
		searchBtn.click();
		waitForPageToLoad(driver);
	}

	@Override
	public String getSearchResultPageTitle()
	{

		logger.info("The page Header Title is "+ pageHeaderTitle.getText().trim());
		return pageHeaderTitle.getText().trim();
	}




}