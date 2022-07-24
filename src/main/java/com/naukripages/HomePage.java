package com.naukripages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//div[text()=\"Rohan Raut\"]")
	public static WebElement rohanLnk;
	@FindBy(css="em.edit")
	public static WebElement editLnk;
	@FindBy(css="input#name")
	public static WebElement nameLnk;
	
	public void clickOnRohanLnk() {
		rohanLnk.click();

	}
	public void clickOnEditLnk() {
		editLnk.click();

	}
	public void enterName(String name) {
	nameLnk.clear();
	nameLnk.sendKeys(name);

	}

}
