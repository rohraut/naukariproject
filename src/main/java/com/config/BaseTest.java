package com.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.main1.UIKeywords;

public class BaseTest {
	@BeforeMethod
	public void openBrowser() {
		UIKeywords.launchBrowser("FIREFOX");
		UIKeywords.launchURL("https://naukri.com");
		UIKeywords.maximize();
		

	}
	//@AfterMethod
	public void closeBrowser() {
		UIKeywords.quiteBrowser();

	}

}
