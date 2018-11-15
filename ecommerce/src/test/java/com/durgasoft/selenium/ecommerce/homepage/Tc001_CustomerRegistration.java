package com.durgasoft.selenium.ecommerce.homepage;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.durgasoft.selenium.ecommerce.basepage.BasePage;
import com.durgasoft.selenium.ecommerce.pageui.createloginaccount;

public class Tc001_CustomerRegistration extends BasePage {
  private static final String Static = null;
  public static final Logger log=Logger.getLogger
		               (Tc001_CustomerRegistration.class.getName());

@Test
  public void CustomerRegistration() throws Exception  {
	log.info("Starting Tc001_CustomerRegistration***");
	  createloginaccount login=new createloginaccount(driver);
	  login.createaccount();
	 log.info("***End of Tc001_CustomerRegistration***");
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  browserlaunch(getdata("browser"), getdata("url"));
	  //browserlaunch("chrome", "http://automationpractice.com/");
	 // browserlaunch("ie", "http://automationpractice.com/");
  }

  @AfterTest
  public void afterTest() {
	  closeBrowser();
  }
public void closeBrowser() {
	driver.quit();
	extent.endTest(test);
	extent.flush();
	
}

}
