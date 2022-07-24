package com.test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.config.BaseTest;
import com.main1.UIKeywords;
import com.naukripages.HomePage;
import com.naukripages.LoginPage;
import com.utils.PropertiesFile;

public class IntegrationTests extends BaseTest {
	
	
	@Test
	public static void m1() throws IOException, InterruptedException {
		LoginPage pg = PageFactory.initElements(UIKeywords.driver, LoginPage.class);
		pg.clickOnLogin();
		String username =PropertiesFile.getValue("username");
		UIKeywords.waitForElement();
		//Thread.sleep(3000);
		pg.enterUsername(username);
		String password =PropertiesFile.getValue("password");
		pg.enterpassword(password);
		pg.clickOnSubmit();
		
		
	     
        
	}
	@Test
	public static void m2() throws IOException {
		
		LoginPage pg = PageFactory.initElements(UIKeywords.driver, LoginPage.class);
		pg.clickOnLogin();
		String username =PropertiesFile.getValue("username");
		UIKeywords.waitForElement();
		//Thread.sleep(3000);
		pg.enterUsername(username);
		String password =PropertiesFile.getValue("password");
		pg.enterpassword(password);
		pg.clickOnSubmit();
		
		HomePage hp = PageFactory.initElements(UIKeywords.driver,HomePage.class);
		//UIKeywords.waitForElement();
		hp.clickOnRohanLnk();
		UIKeywords.waitForElement();
		hp.clickOnEditLnk();
		String name = PropertiesFile.getValue("name");
		hp.enterName(name);
		
		
		

	}
	


}
