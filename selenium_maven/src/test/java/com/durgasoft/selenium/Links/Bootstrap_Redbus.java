package com.durgasoft.selenium.Links;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Bootstrap_Redbus {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("i-icon-profile")).click();
	  Thread.sleep(5000);
	  WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
	  signin.click();
	  Thread.sleep(8000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modaliframe']")));
	  driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://redbus.in");
	  driver.manage().window().maximize();

  }

}
