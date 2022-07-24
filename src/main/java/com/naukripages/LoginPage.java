package com.naukripages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath="(//div[@class=\"mTxt\"])[5]")
	public static WebElement LoginLnk;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[2]/div/form/div[2]/input")
	public static WebElement userNameLnk;
	@FindBy(css="input[type=\"password\"]")
	public static WebElement passwordLnk;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[2]/div/form/div[6]/button")
	public static WebElement SubmitLnk;
	
	
	public void clickOnLogin() {
	LoginLnk.click();

	}
	public void enterUsername(String username) {
		userNameLnk.sendKeys(username);
		
	}
	public void enterpassword(String password) {
		passwordLnk.sendKeys(password);
		
	}
	public void clickOnSubmit() {
		SubmitLnk.click();
		
		
	}
	

}
