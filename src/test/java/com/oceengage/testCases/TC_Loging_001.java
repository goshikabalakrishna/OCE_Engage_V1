package com.oceengage.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oceengage.pageObject.LoginPage;


public class TC_Loging_001 extends BaseClass 

{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
	
		
		logger.info("URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(1000);
		logger.info("Entered Username");
			
		lp.setPassword(password);
		Thread.sleep(1000);
		logger.info("Entered Password");		
		
		lp.clickSubmit();
		Thread.sleep(5000);
				
		if(driver.getTitle().equals("Home | Salesforce"))
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
			lp.clickUserProfile();
			Thread.sleep(3000);
			logger.info("Clicked on Veiw Profile");
			lp.clickLogout();
			Thread.sleep(3000);
			logger.info("page logout successfully");
		}
		else
		{
			logger.info("Login test Failed");
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
		
		}
			
	}

}
