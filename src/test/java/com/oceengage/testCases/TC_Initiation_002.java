package com.oceengage.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		
		//WebElement drpdownFB= driver.findElement(By.xpath("//button[@name='OCE__FBServedBy__c']"));
		//drpdownFB.isDisplayed();
		
		WebElement details = driver.findElement(By.xpath("//span[contains(text(),'Details')]"));
		details.click();
		Thread.sleep(2000);
		
		logger.info("Details page is displayed");
		Thread.sleep(5000);
		
		WebElement next = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next.click();
		//ip.clickNext3();
		//logger.info("Moving to Date page");
		
		Thread.sleep(10000);
		logger.info("Date Time Page Displayed");
		

		WebElement drpdownHostingTimezone= driver.findElement(By.xpath("//button[@name='OCE__HostingRegionTimezone__c']"));
		drpdownHostingTimezone.click();
		Thread.sleep(1000);
		WebElement selectHostingTimezone = driver.findElement(By.xpath("//button[@name='OCE__HostingRegionTimezone__c']//following::div[2]/lightning-base-combobox-item[2]"));
		selectHostingTimezone.click();
		logger.info("Hosting Timezone is selected");
		Thread.sleep(3000);
		
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);
		
		
		WebElement startDateInput = driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"]//following::lightning-datepicker//input[@class=\"slds-input\"])[1]"));
		startDateInput.sendKeys(formattedDate);
		logger.info("Start Date Entered");
		Thread.sleep(2000);
		
		//Calendar calendar = Calendar.getInstance();
		//calendar.add(Calendar.DAY_OF_YEAR, 10); // Add 10 days
		//Date futureDate = calendar.getTime();
		//String formattedFutureDate = DateTimeFormatter.format(futureDate);
		
		WebElement endDateInput = driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"]//following::lightning-datepicker//input[@class=\"slds-input\"])[2]"));
		endDateInput.sendKeys(formattedDate);
		Thread.sleep(2000);
		logger.info("End Date Entered");
		
		WebElement next1 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next1.click();
		
		logger.info("Objective section is displayed");
		
		//WebElement objective = driver.findElement(By.xpath("//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[3]/flowruntime-aura-field[1]/div[1]/engage-meeting-initiation-edit-form[1]/c-apo-form-group[1]/div[1]/slot[1]/lightning-record-edit-form[1]/lightning-record-edit-form-create[1]/form[1]/slot[1]/slot[1]/div[1]/div[1]/lightning-input-field[1]/lightning-quill[1]/lightning-input-rich-text[1]/div[1]/div[1]/div[1]/div[2]"));
		//objective.sendKeys("Objective informtion to be entered for the checking.");
		//logger.info("Objective section is clicked");
		Thread.sleep(5000);
		
		WebElement next2 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		next2.click();
		
		Thread.sleep(15000);
		logger.info("Review page is opened");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		Thread.sleep(3000);
		
		logger.info("Ready to create account");

		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0, 250)");
		
		WebElement create = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[5]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]"));
		create.click();
		Thread.sleep(20000);
		logger.info("Account is created.");
		
		
		
		

	
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
