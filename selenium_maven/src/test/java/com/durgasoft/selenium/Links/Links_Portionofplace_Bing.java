package com.durgasoft.selenium.Links;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class Links_Portionofplace_Bing {
	public WebDriver driver;
	
  @Test
  public void Links_Bing_StaticLinks() {
	  WebElement header = driver.findElement(By.id("sc_hdu"));
	 List<WebElement> links = header.findElements(By.tagName("a"));
	 System.out.println("Available links are:" +links.size());
	 for(int i=0;i<links.size();i++) {
		 System.out.println(links.get(i).getText());
		 if(!links.get(i).getText().isEmpty()) {
			 if(links.get(i).getText().contentEquals("Maps")) {
				 System.out.println("The links is available:"+links.get(i).getText());
				 links.get(i).click();
				 break;
			 }
		 }
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://bing.com");
	  driver.manage().window().maximize();
  }

}
