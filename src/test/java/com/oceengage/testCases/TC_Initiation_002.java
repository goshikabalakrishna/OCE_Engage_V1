package com.oceengage.testCases;

import java.awt.AWTException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oceengage.pageObject.InitiationPage;
import com.oceengage.pageObject.LoginPage;

public class TC_Initiation_002 extends BaseClass

{
	@Test
	public void InitiationPage() throws IOException, InterruptedException, AWTException 
	{
		
		logger.info("URL is Opened");
		
		InitiationPage ip = new InitiationPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(1000);
		logger.info("Entered Username");
			
		lp.setPassword(password);
		Thread.sleep(1000);
		logger.info("Entered Password");		
		
		lp.clickSubmit();
		Thread.sleep(5000);
		
		if(driver.getTitle().equals(("Home | Salesforce")))
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
			
		}
		
		logger.info("Meeting Initiation Started..");

		Thread.sleep(5000);
		ip.clickMeeting();
		logger.info("Clicked on New Engagements");
		Thread.sleep(5000);

		ip.clickRecordType();
		logger.info("Clicked on Record Type");
		Thread.sleep(5000);
		ip.clickNext1();
		Thread.sleep(15000);
		logger.info("Organization page is opened");
	
		WebElement search_box1=driver.findElement(By.xpath("(//div[@class=\"apo-input\"])[1]"));
		search_box1.click();
		Thread.sleep(10000);
		logger.info("Organizing BU clicked");
		
		//ip.clickAdvanceSearch();
		ip.clickBusinessUnit();
		logger.info("Organizing BU Selected");
		Thread.sleep(2000);
		
		WebElement search_box2=driver.findElement(By.xpath("(//div[@class=\"apo-input\"])[2]"));
		search_box2.click();
		logger.info("Payer clicked");
		Thread.sleep(5000);
		
		ip.clickPayer();
		logger.info("Payer Selected");
		Thread.sleep(5000);
		

		ip.clickNext2();
		Thread.sleep(10000);
		
		logger.info("Details Page Opened");
		
		String meetingName = "Auto Meeting "+randomNumber();
		ip.inputMeetingName(meetingName);
		logger.info("Meeting Name Entered");
		Thread.sleep(2000);
		
		String number = randomNumber();
		ip.inputPlannedExperts(number);
		logger.info("Planned Experts Entered");
		Thread.sleep(2000);
		
		WebElement drpdownSubtype = driver.findElement(By.xpath("//button[@name='OCE__Subtype__c']"));
		drpdownSubtype.click();
		Thread.sleep(1000);
		WebElement selectSubtype = driver.findElement(By.xpath("//button[@name='OCE__Subtype__c']//following::div[2]//lightning-base-combobox-item[3]"));
		selectSubtype.click();
		logger.info("Sub Type is Selected");
			
		WebElement drpdownlocation= driver.findElement(By.xpath("//button[@name='OCE__LocationType__c']"));
		drpdownlocation.click();
		Thread.sleep(1000);
		WebElement selectLocationtype = driver.findElement(By.xpath("//button[@name='OCE__LocationType__c']//following::div[2]/lightning-base-combobox-item[3]"));
		selectLocationtype.click();
		logger.info("Location Type is selected");
		
		WebElement drpdownPromotionNature= driver.findElement(By.xpath("//button[@name='AZ_Is_the_activity_promotional_in_nature__c']"));
		drpdownPromotionNature.click();
		Thread.sleep(1000);
		WebElement selectPromotionNature= driver.findElement(By.xpath("//button[@name='AZ_Is_the_activity_promotional_in_nature__c']//following::div[2]/lightning-base-combobox-item[2]"));
		selectPromotionNature.click();
		logger.info("Promotion Nature is Selected");
		
		WebElement drpdownFB= driver.findElement(By.xpath("//button[@name='OCE__FBServedBy__c']"));
		drpdownFB.click();
		Thread.sleep(1000);
		WebElement selectFB= driver.findElement(By.xpath("//button[@name='OCE__FBServedBy__c']//following::div[2]/lightning-base-combobox-item[2]"));
		selectFB.click();
		logger.info("FB is Selected");
		
		
		WebElement details = driver.findElement(By.xpath("//span[contains(text(),'Details')]"));
		details.click();
		Thread.sleep(2000);
		
		logger.info("Details page is displayed");
		Thread.sleep(5000);
		
		WebElement next = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next.click();
		
		Thread.sleep(10000);
		logger.info("Date Time Page Displayed");
		
		WebElement drpdownHostingTimezone= driver.findElement(By.xpath("//button[@name='OCE__HostingRegionTimezone__c']"));
		drpdownHostingTimezone.click();
		Thread.sleep(1000);
		WebElement selectHostingTimezone = driver.findElement(By.xpath("//button[@name='OCE__HostingRegionTimezone__c']//following::div[2]/lightning-base-combobox-item[2]"));
		selectHostingTimezone.click();
		logger.info("Hosting Timezone is selected");
		Thread.sleep(3000);
		
		//Beow is the code to Current Date
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);
		WebElement startDateInput = driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"]//following::lightning-datepicker//input[@class=\"slds-input\"])[1]"));
		startDateInput.sendKeys(formattedDate);
		logger.info("Start Date Entered with Todays Date");
		Thread.sleep(2000);
		
		//below code is for Future Date
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 5);
		Date futureDate = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String formattedEndDate = dateFormat.format(futureDate);
		WebElement endDateInput = driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"]//following::lightning-datepicker//input[@class=\"slds-input\"])[2]"));
		endDateInput.sendKeys(formattedEndDate.toString());	
		Thread.sleep(4000);
		logger.info("End Date is Entered with Future Date");
		
		
		WebElement FormattedEndReadOnly = driver.findElement(By.xpath("//span[contains(text(),'Formatted End Date/Time')]"));
		FormattedEndReadOnly.click();
		Thread.sleep(5000);
		
		
		WebElement next1 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next1.click();
		
		
		//Objective Section need to impplement
		
		/*WebElement objective = driver.findElement(By.xpath("//span[text()=\"Objectives\"]//parent::span//following-sibling::div//div[@class=\"slds-rich-text-editor__textarea slds-grid editor ql-container\"]//div//p"));
		//objective.click();
		Thread.sleep(2000);
		objective.sendKeys("Objective informtion to be entered for the checking which is mandatory field in meeeting details page");
		logger.info("Objective information is entered");
		Thread.sleep(5000); */
		
		WebElement next2 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next2.click();
		
		Thread.sleep(15000);
		logger.info("Review page is opened");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		Thread.sleep(3000);
		
		logger.info("Ready to create account");

		
		WebElement create = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[5]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		create.click();
		Thread.sleep(25000);
		
		if (driver.getTitle().equals(meetingName+" | Meeting | Salesforce")) 
		{
			Assert.assertTrue(true);
			logger.info("Account created successfully.");
			lp.clickUserProfile();
			Thread.sleep(3000);
			//lp.clickLogout();
			//Thread.sleep(3000);
			//logger.info("Logout Successfully.!");
			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Account Creation Failed.");
			captureScreen(driver, "Initiation Page");
		}
			
	
	}
	
	public String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return(generatedString);
		
	}
	public String randomNumber()
	{
		
		String generatedNumber = RandomStringUtils.randomNumeric(2);
		return(generatedNumber);
		
		
	}
	

}
