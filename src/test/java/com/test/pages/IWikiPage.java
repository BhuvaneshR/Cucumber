package com.test.pages;

import org.openqa.selenium.WebElement;

public interface IWikiPage {


  WebElement wikiSearchInputBox =null;
  WebElement searchBtn =null;
  WebElement pageHeaderTitle =null;


  void searchForKeywordInWiki(String searchKeyword);
  String getSearchResultPageTitle();



}
