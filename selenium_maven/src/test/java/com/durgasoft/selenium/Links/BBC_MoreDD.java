package com.durgasoft.selenium.Links;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BBC_MoreDD  
{
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("More")).click();
	  Thread.sleep(5000);
	  List<WebElement> header = driver.findElements(By.xpath("//*[@id='orb-panel-more']/div/ul/a"));
	  for(WebElement ele:header) 
	  {
		ele.getAttribute("innerHTML");
		if(header.contains("Radio"));
		ele.click();
		break;
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  /*System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://BBC.com");
	  driver.manage().window().maximize();**/
	  driver = new FirefoxDriver();
	  driver.get("http://BBC.com");
	  driver.manage().window().maximize();
	  
	  

  }
  

}
