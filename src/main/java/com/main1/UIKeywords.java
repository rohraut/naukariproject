package com.main1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
   public static RemoteWebDriver driver = null;

	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browserName");
		}
	
	
		
	}

	public static void launchURL(String url) {
		driver.get(url);
		
		
	}

	public static void clickElement(String clickElement) {
		driver.findElement(By.xpath(clickElement)).click();
		
		
	}

	public static void closeBrowser() {
		driver.close();
		
	}
	public static  void quiteBrowser() {
		driver.quit();

	}

	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	public static void waitForElement() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
	}
	

}
