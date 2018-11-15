package com.durgasoft.selenium.Links;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Explicitwait {
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver, 120);
	  driver.findElement(By.id("lst-ib")).sendKeys("python tutorial");
	  Thread.sleep(5000);
	  List<WebElement> header = driver.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul"));
  for(int i=0;i<header.size();i++) {
	  System.out.println(header.get(i).getAttribute("innerHTML"));
	  if(header.get(i).getAttribute("innerHTML").contains("point"));
	  wait.until(ExpectedConditions.elementToBeClickable(header.get(i))).click();
	  break;
  }
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();

  }

}
