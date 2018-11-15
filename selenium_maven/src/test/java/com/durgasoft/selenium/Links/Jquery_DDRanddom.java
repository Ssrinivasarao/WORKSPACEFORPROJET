package com.durgasoft.selenium.Links;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Jquery_DDRanddom {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	  WebElement header = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
	  List<WebElement> ddvalues = header.findElements(By.tagName("input"));
	  System.out.println("Available values in DD:"+ddvalues.size());
	  
	  Random r=new Random();
	  ddvalues.get(r.nextInt(ddvalues.size())).click();
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.jQuery-az.com/boots/demo.php?ex=63.0_1");
	  driver.manage().window().maximize();

  }

}
