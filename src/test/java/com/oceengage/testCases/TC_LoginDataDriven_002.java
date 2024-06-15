package com.oceengage.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oceengage.pageObject.LoginPage;
import com.oceengage.utilities.XLUtils;

public class TC_LoginDataDriven_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDataDriven(String user, String pwd) throws InterruptedException 
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.clearUserName();
		Thread.sleep(3000);
		lp.setUserName(user);
		Thread.sleep(3000);
		logger.info("Entered Username");
		lp.setPassword(pwd);
		Thread.sleep(3000);
		logger.info("Entered Password");
		lp.clickSubmit();
		Thread.sleep(3000);
		
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
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			logger.info("reached to login page");
			Thread.sleep(3000);

			
		}
		
		//Not entering to else loop - need to try with- driver.getPageSource().contains(Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		else 
		{

			lp.errorMessage();
			Assert.assertTrue(false);
			logger.info("Login test Failed");
			driver.switchTo().defaultContent();

			
		}
	}


	@DataProvider(name = "LoginData")
    String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/oceengage/testData/LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", rownum);
		
		String logindata [][] = new String[rownum][colcount];
		
		for(int i=1; i<rownum; i++) 
		{
			for(int j=0; j<colcount; j++)
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return logindata;
		
	}

	

}
