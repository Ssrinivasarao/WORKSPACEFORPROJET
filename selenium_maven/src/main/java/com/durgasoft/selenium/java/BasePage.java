package com.durgasoft.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.server.browserlaunchers.InternetExplorerCustomProxyLauncher;

public class BasePage {
	public WebDriver driver;
	public void BrowserLaunch(String browser, String Url) {
		if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.IE.driver", "E:\\Library\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
					}
		driver.get(Url);
		driver.manage().window().maximize();
		
		
	}
	
	

}
