package com.durgasoft.selenium.Links;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Echo_checkbox {
	public WebDriver driver;
	
  @Test (enabled = false)
  public void f() {
	 List<WebElement> checkbox = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	  for(int i=0;i<checkbox.size();i++)
	  { 
		  System.out.println(checkbox.get(i).getAttribute("value")+"---"+checkbox.get(i).getAttribute("checked"));
		  
	  }
	  
  }
  @Test
  public void f1() {
	  List<WebElement> checkbox = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	 System.out.println(checkbox.size());
	  for(int i=0;i<checkbox.size();i++)
	  {
		  if(!checkbox.get(i).isSelected())
			  checkbox.get(i).click();
	  }
		  
	 
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://echoecho.com/htmlforms09.html");
	  driver.manage().window().maximize();

  }

}
