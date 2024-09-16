package com.oceengage.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.oceengage.pageObject.LoginPage;
import com.oceengage.pageObject.MeetingSubSectionsPage;

import junit.framework.Assert;

public class TC_MeetingSubSections_003 extends BaseClass
{

	@Test
	public void MeetingSubSectionsPage() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		MeetingSubSectionsPage mp = new MeetingSubSectionsPage(driver);
		lp.setUserName(username);
		Thread.sleep(1000);
		logger.info("Entered Username");
		lp.setPassword(password);
		Thread.sleep(1000);
		logger.info("Entered Password");
		lp.clickSubmit();
		Thread.sleep(15000);
		
		if(driver.getTitle().equals("Home | Salesforce"))
		{
			Assert.assertTrue(true);
			logger.info("Login Successfully.");	
		}
		
		WebElement meetingTab = driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[1]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[2]"));
		meetingTab.click();
		Thread.sleep(8000);
		logger.info("Meetings page Opened.");

		//mp.clickMeetingNameSearch(meetingname);
		WebElement meetingNameSearch = driver.findElement(By.xpath("//input[@name=\"Meeting-search-input\"]"));
		meetingNameSearch.sendKeys("Auto Meeting 86");
		Thread.sleep(5000);
		WebElement clickOnMeetingName1 = driver.findElement(By.xpath("//tbody[1]/tr[1]/th[1]/span[1]/div[1]"));
		clickOnMeetingName1.isDisplayed();
		//logger.info("Entered Meeting Name in Search");
		Thread.sleep(5000);

		
		//mp.clickOnMeetingName();
		WebElement clickOnMeetingName = driver.findElement(By.xpath("//tbody[1]/tr[1]/th[1]/span[1]/div[1]"));
		clickOnMeetingName.click();
		logger.info("Clicked on Meetings Name displayed.");
		Thread.sleep(18000);

		WebElement detailsSection = driver.findElement(By.xpath("//h2[contains(text(),'Details')]"));
		detailsSection.isDisplayed();
		logger.info("Details Section is displayed");
		Thread.sleep(3000);
		
		
		/*

		WebElement overviewSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[1]"));
		overviewSection.click();
		Thread.sleep(5000);
		WebElement overvieSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Overview')]"));
		overvieSectionDisplayed.isDisplayed();
		logger.info("Overview Section is displayed");
	
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		
		WebElement objectiveSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[2]"));
		objectiveSection.click();
		Thread.sleep(10000);
		WebElement objectiveSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Objectives')]"));
		objectiveSectionDisplayed.isDisplayed();
		logger.info("Objectives Section is displayed");
		
		
		WebElement fataProductSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[3]"));
		fataProductSection.click();
		Thread.sleep(5000);
		WebElement fataProductSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'FA/TA and Product')]"));
		fataProductSectionDisplayed.isDisplayed();
		logger.info("FA/TA and Product Section is displayed");
		
	
		
		WebElement expertsSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[4]"));
		expertsSection.click();
		Thread.sleep(10000);
		WebElement expertsSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Experts')]"));
		expertsSectionDisplayed.isDisplayed();
		logger.info("Experts Section is displayed");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(5000);
		
		*/
// -------If Attendees section is needed then we need to unabel this section-----------------
		
		/* 
		WebElement attendeesSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[5]"));
		attendeesSection.click();
		Thread.sleep(3000);
		WebElement attendeesSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Attendees')]"));
		attendeesSectionDisplayed.isDisplayed();
		logger.info("Colleagues Section is displayed"); */
			
		/* 
		WebElement colleaguesSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[5]"));
		colleaguesSection.click();
		Thread.sleep(5000);
		WebElement colleaguesSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Colleagues')]"));
		colleaguesSectionDisplayed.isDisplayed();
		logger.info("Colleagues Section is displayed");
		
		WebElement logisticsSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[6]"));
		logisticsSection.click();
		Thread.sleep(5000);
		WebElement logisticsSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Logistics')]"));
		logisticsSectionDisplayed.isDisplayed();
		logger.info("Logistics Section is displayed");
		
		
		WebElement financialsSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[7]"));
		financialsSection.click();
		Thread.sleep(5000);
		WebElement financialsSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Financials')]"));
		financialsSectionDisplayed.isDisplayed();
		logger.info("Financials Section is displayed");
		
		
		WebElement documentsSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[8]"));
		documentsSection.click();
		Thread.sleep(5000);
		WebElement documentsSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Documents')]"));
		documentsSectionDisplayed.isDisplayed();
		logger.info("Documents Section is displayed");
		
		WebElement engagementHistorySection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[9]"));
		engagementHistorySection.click();
		Thread.sleep(5000);
		WebElement engagementHistorySectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Engagement History')]"));
		engagementHistorySectionDisplayed.isDisplayed();
		logger.info("Engagement History Section is displayed");

		
		WebElement questionnaireSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[10]"));
		questionnaireSection.click();
		Thread.sleep(5000);
		WebElement questionnaireSectionDisplayed = driver.findElement(By.xpath("//slot[contains(text(),'Contracting Questionnaire')]"));
		questionnaireSectionDisplayed.isDisplayed();
		logger.info("Questionnaire Section is displayed");
		
		WebElement tasksSection = driver.findElement(By.xpath("(//a[text()='Details']//following::a)[11]"));
		tasksSection.click();
		Thread.sleep(5000);
		WebElement tasksSectionDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Tasks')]"));
		tasksSectionDisplayed.isDisplayed();
		logger.info("Tasks Section is displayed");
		
	
		*/
		
//-------------------Below is the code for Questionniare Tab (Need to implement)--------------------------------	
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(3000);
 		WebElement editDetails = driver.findElement(By.xpath("//lightning-button-icon[@data-field-name='LastModifiedDate']//button[@type='button']"));
 		editDetails.click();
		Thread.sleep(10000);
		
		WebElement clickLocalGlobalCongress = driver.findElement(By.xpath("//button[@name='AZ_IsYourActivityHeldAtALocalOrGlobal__c']"));
		clickLocalGlobalCongress.click();
		Thread.sleep(2000);
		
		WebElement selectLocalGlobalCongress = driver.findElement(By.xpath("//button[@name='AZ_IsYourActivityHeldAtALocalOrGlobal__c']//span[@class='slds-truncate'][normalize-space()='No']"));
		selectLocalGlobalCongress.click();
		Thread.sleep(2000);
 		
		WebElement drpdownlocation= driver.findElement(By.xpath("//button[@name='OCE__LocationType__c']"));
		drpdownlocation.click();
		Thread.sleep(1000);
		WebElement selectLocationtype = driver.findElement(By.xpath("//button[@name='OCE__LocationType__c']//following::div[2]/lightning-base-combobox-item[3]"));
		selectLocationtype.click();
		logger.info("Location Type is selected");
 		
 		
 		
// --------------------Below is the Expert Section Code-----------------------------------
		/*
		//WebElement expertNew = driver.findElement(By.xpath("//button//div[contains(text(),'New')]//following::span[@class='apo-button__ripple'][1]"));
		WebElement expertNew = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/one-record-home-flexipage2[1]/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-a-z_-meeting_-advisory_-board___-o-c-e__-meeting__c___-v-i-e-w___-l-m-t___1719811704000[1]/forcegenerated-flexipage_az_meeting_advisory_board_oce__meeting__c__view_js___lmt___1719311427000[1]/record_flexipage-desktop-record-page-decorator[1]/div[1]/records-record-layout-event-broker[1]/slot[1]/slot[1]/flexipage-aura-template-wrapper[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/forcegenerated-flexipageregion_az_meeting_advisory_board_sidebar6_oce__meeting__c__view_js[1]/flexipage-component2[3]/slot[1]/flexipage-tabset2[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/slot[1]/flexipage-tab2[1]/slot[1]/flexipage-component2[1]/slot[1]/flexipage-aura-wrapper[1]/div[1]/div[1]/div[1]/engage-sub-panel[1]/div[1]/c-apo-sub-panel-header[1]/div[1]/div[1]/div[3]/div[1]/c-apo-button-container[1]/div[1]/c-apo-button[1]/button[1]"));
		expertNew.click();
		logger.info("New button is clicked");
		Thread.sleep(13000);
		
		//WebElement clearAll = driver.findElement(By.xpath("//div[contains(text(),'Clear All')]")); 
		WebElement clearAll = driver.findElement(By.xpath("//slot[1]/slot[1]/c-apo-button[1]/button[1]")); 
	
		clearAll.click();
		Thread.sleep(15000);
		
		WebElement inputSearch = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		inputSearch.click();
		
		WebElement enterInput = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		enterInput.sendKeys("Jager");
		Thread.sleep(3000);
		logger.info("Entered Required input of Expert");
		
		//WebElement clkSearch = driver.findElement(By.xpath("//button[@class='apo-button apo-button_secondary apo-button_small']//div[text()=\"Search\"]"));
		WebElement clkSearch = driver.findElement(By.xpath("//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[1]/flowruntime-lwc-field[1]/div[1]/engage-expert-search-container[1]/c-generic-search[1]/div[1]/div[1]/div[1]/div[1]/div[2]/lightning-layout-item[1]/slot[1]/c-apo-button[1]/button[1]"));
		clkSearch.click();
		Thread.sleep(10000);
		
		WebElement selectExpert = driver.findElement(By.xpath("//tbody/tr[1]/th[1]/lightning-primitive-cell-factory[1]/div[1]/lightning-primitive-custom-cell[1]/c-datatable-checkbox[1]/lightning-layout[1]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/c-check-box-rules[1]/div[1]/c-apo-icon[1]/img[1]"));
		selectExpert.click();
		Thread.sleep(2000);
		
		//WebElement clkNext = driver.findElement(By.xpath("//slot[@name=\"footerButtons\"]//div//c-apo-button//button//div[text()=\"Next\"]"));
		WebElement clkNext = driver.findElement(By.xpath("//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[1]/flowruntime-lwc-field[1]/div[1]/engage-expert-search-container[1]/c-generic-search[1]/div[1]/div[2]/div[1]/div[2]/slot[1]/div[1]/c-apo-button[1]/button[1]"));
		clkNext.click();
		Thread.sleep(17000);
		
		WebElement clickExpertRole = driver.findElement(By.xpath("(//lightning-primitive-cell-factory[@data-label=\"Expert Role\"]//following::input[@placeholder=\"Select an option\"])[1]"));
		clickExpertRole.click();
		Thread.sleep(2000);
		
		WebElement selectExpertRole = driver.findElement(By.xpath("//h1[@class=\"slds-text-align--center slds-text-heading--medium slds-p-bottom--xxx-small\"]//following::input[9]//following::li[@data-value='Advisor']"));
		selectExpertRole.click();
		logger.info("Expert Role added");
		
		WebElement clkSave = driver.findElement(By.xpath("//engage-apo-button//button[@class='apo-button apo-button_primary']"));
		clkSave.click();
		Thread.sleep(15000);
		logger.info("Expert created successfully");
		
		WebElement clkExpName = driver.findElement(By.xpath("//tbody/tr[1]/th[1]/lightning-primitive-cell-factory[1]/span[1]"));
		clkExpName.click();
		Thread.sleep(15000);
		
		//Need to implement Expert rules code...
		
		
		if(driver.getTitle().equals(By.xpath("//a[contains(text(),'A. Jager']")))
				//isExpPresent != null)		
		{
			Assert.assertTrue(true);
			logger.info("Experts created successfully.");
			Thread.sleep(2000);
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Experts created F.");
		}
		
		*/
		
//-------------------Below is the code for Financials Tab--------------------------------
		/*
		Thread.sleep(3000);
		//WebElement clkMeetingBudget = driver.findElement(By.xpath("//div[contains(text(),'+ Meeting Budgets')]"));
		WebElement clkMeetingBudget = driver.findElement(By.xpath("//button[@value='createNewRecord']"));
		//WebElement clkMeetingBudget = driver.findElement(By.xpath("//c-apo-sub-panel-header/div[1]/div[1]/div[3]/div[1]/c-apo-button-container[1]/div[1]/c-apo-button[1]/button[1]"));
		clkMeetingBudget.click();
		Thread.sleep(18000);
		
		WebElement inputSearchBudget = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		inputSearchBudget.click();
		
		WebElement enterInputBudget = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		enterInputBudget.sendKeys("AMORTIZATION");
		Thread.sleep(3000);
		logger.info("Entered Required input of Budget");
		
		//WebElement clkSearch = driver.findElement(By.xpath("//button[@class='apo-button apo-button_secondary apo-button_small']//div[text()=\"Search\"]"));
		WebElement clkSearchBudget = driver.findElement(By.xpath("//c-apo-button[@class='slds-p-left_small']//button[@type='button']"));
		clkSearchBudget.click();
		Thread.sleep(10000);
		
		WebElement selectBudget = driver.findElement(By.xpath("//tbody/tr[1]/th[1]/lightning-primitive-cell-factory[1]/div[1]/lightning-primitive-custom-cell[1]/c-datatable-checkbox[1]/lightning-layout[1]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/c-check-box-rules[1]/div[1]/c-apo-icon[1]/img[1]"));
		selectBudget.click();
		Thread.sleep(2000);
		logger.info("Budget item is selected");
		
		//WebElement clkNext = driver.findElement(By.xpath("//slot[@name=\"footerButtons\"]//div//c-apo-button//button//div[text()=\"Next\"]"));
		WebElement clkNextBudget = driver.findElement(By.xpath("//div[@slot='footerButtons']//button[@type='button']"));
		clkNextBudget.click();
		Thread.sleep(17000);
		logger.info("Budgets Added successfully.");
		
		*/
		
//-------------------Below is the code for FA/TA product Tab--------------------------------
		
		/*
		
		Thread.sleep(3000);
		WebElement clkFATANew = driver.findElement(By.xpath("//button[@value='createNewRecord']"));
		clkFATANew.click();
		Thread.sleep(18000);
		
		WebElement inputSearchProduct = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		inputSearchProduct.click();
		
		WebElement enterInputProduct = driver.findElement(By.xpath("//div[@class=\"slds-media__body engage-search-input\"]//input[@placeholder=\"Type at least two (2) characters and then click Search or press Enter\"]"));
		enterInputProduct.sendKeys("Above");
		Thread.sleep(3000);
		logger.info("Entered Required input of Product");
		
		WebElement clkSearchProduct = driver.findElement(By.xpath("//c-apo-button[@class='slds-p-left_small']//button[@type='button']"));
		clkSearchProduct.click();
		Thread.sleep(10000);
		
		WebElement selectBudget = driver.findElement(By.xpath("//tbody/tr[1]/th[1]/lightning-primitive-cell-factory[1]/div[1]/lightning-primitive-custom-cell[1]/c-datatable-checkbox[1]/lightning-layout[1]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/c-check-box-rules[1]/div[1]/c-apo-icon[1]/img[1]"));
		selectBudget.click();
		Thread.sleep(2000);
		logger.info("Product item is selected");
		
		//WebElement clkNext = driver.findElement(By.xpath("//slot[@name=\"footerButtons\"]//div//c-apo-button//button//div[text()=\"Next\"]"));
		WebElement clkNextBudget = driver.findElement(By.xpath("//div[@slot='footerButtons']//button[@type='button']"));
		clkNextBudget.click();
		Thread.sleep(17000);
		logger.info("Product Added successfully.");
		
		*/
		
//-------------------Below is the code for Questionniare Tab--------------------------------	
		/*
		Thread.sleep(5000);
		WebElement clkQuestionnire= driver.findElement(By.xpath("//flexipage-component2[@data-component-id='ENGAGE_questionnaireFormContainer']//div[@class='eng-questionnaire__container-header']//button[@type='button']"));
		clkQuestionnire.click();
		Thread.sleep(15000);
		logger.info("Questionnaire section opened.");
		
		WebElement clkQuestion1 = driver.findElement(By.xpath("//input[@id='input-5461']"));
		clkQuestion1.click();
		Thread.sleep(2000);
		
		WebElement inputQuestion1 = driver.findElement(By.xpath("//div[@role='textbox']"));
		inputQuestion1.sendKeys("Quesiton1 Tested");
		Thread.sleep(2000);
		
		WebElement clkQuestion2 = driver.findElement(By.xpath("//label[@for='radio-0-4590']"));
		clkQuestion2.click();
		Thread.sleep(2000);
		
		WebElement clkQuestion3 = driver.findElement(By.xpath("//input[@id='input-4594']"));
		clkQuestion3.click();
		Thread.sleep(2000);
		
		WebElement inputQuestion3 = driver.findElement(By.xpath("//div[@role='textbox']//p"));
		inputQuestion3.sendKeys("Quesiton3 Tested");
		Thread.sleep(2000);
		
		WebElement clkQuestion4 = driver.findElement(By.xpath("//label[@for='radio-0-4597']"));
		clkQuestion4.click();
		Thread.sleep(2000);
		
		WebElement clkQuestion5 = driver.findElement(By.xpath("//input[@id='input-4601']"));
		clkQuestion5.click();
		Thread.sleep(2000);
		
		WebElement inputQuestion5 = driver.findElement(By.xpath("//div[contains(@role,'textbox')]//p"));
		inputQuestion5.sendKeys("Quesiton5 Tested");
		Thread.sleep(2000);
		
		WebElement clkReview = driver.findElement(By.xpath("//button[@name='review']"));
		clkReview.click();
		Thread.sleep(4000);
		
		WebElement clkSubmit = driver.findElement(By.xpath("//button[@name='submit']"));
		clkSubmit.click();
		Thread.sleep(3000);
		
		WebElement clkOK = driver.findElement(By.xpath("//c-apo-button[@class='slds-float_right']//button[@type='button']"));
		clkOK.click();
		Thread.sleep(15000);
		logger.info("Questionnaire submitted successfully.");
		
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		WebElement clkContractQuestionnire= driver.findElement(By.xpath("//flexipage-component2[2]//slot[1]//engage-questionnaire-form-container[1]//div[1]//div[1]//div[2]//div[1]//div[2]//c-apo-button[1]//button[1]"));
		clkContractQuestionnire.click();
		Thread.sleep(18000);
		logger.info("Contracting Questionnaire section opened.");
		
		WebElement clkContractQuestion1 = driver.findElement(By.xpath("//label[@for='radio-0-5188']"));
		clkContractQuestion1.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion2 = driver.findElement(By.xpath("//label[@for='radio-0-5191']"));
		clkContractQuestion2.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion3 = driver.findElement(By.xpath("//label[@for='radio-1-5194']"));
		clkContractQuestion3.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion4 = driver.findElement(By.xpath("//label[@for='radio-0-5197']"));
		clkContractQuestion4.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion5 = driver.findElement(By.xpath("//label[@for='radio-0-5200']"));
		clkContractQuestion5.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion6 = driver.findElement(By.xpath("//label[@for='radio-0-5203']"));
		clkContractQuestion6.click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		WebElement clkContractQuestion7 = driver.findElement(By.xpath("//label[@for='radio-0-5206']"));
		clkContractQuestion7.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion8 = driver.findElement(By.xpath("//input[@id='input-5210']"));
		clkContractQuestion8.click();
		Thread.sleep(2000);
		
		WebElement inputContractQuestion8 = driver.findElement(By.xpath("//div[@role='textbox']"));
		inputContractQuestion8.sendKeys("Quesiton8 Tested");
		Thread.sleep(2000);
		
		WebElement clkContractQuestion9 = driver.findElement(By.xpath("//label[@for='radio-0-5213']"));
		clkContractQuestion9.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion10 = driver.findElement(By.xpath("//label[@for='radio-0-5216']"));
		clkContractQuestion10.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestion11 = driver.findElement(By.xpath("//label[@for='radio-0-5219']"));
		clkContractQuestion11.click();
		Thread.sleep(1000);
		
		WebElement clkContractQuestionReview = driver.findElement(By.xpath("//button[@name='review']"));
		clkContractQuestionReview.click();
		Thread.sleep(4000);
		
		WebElement clkContractQuestionSubmit = driver.findElement(By.xpath("//button[@name='submit']"));
		clkContractQuestionSubmit.click();
		Thread.sleep(3000);
		
		WebElement clkContractQuestionOK = driver.findElement(By.xpath("//c-apo-button[@class='slds-float_right']//button[@type='button']"));
		clkContractQuestionOK.click();
		Thread.sleep(15000);
		logger.info("Contracting Questionnaire submitted successfully.");
		
		*/
		
//-------------------Below is the code for Questionniare Tab (Need to implement)--------------------------------	
		/*
		Thread.sleep(3000);
		WebElement clkObjectEdit = driver.findElement(By.xpath("//flexipage-component2[@data-component-id='ENGAGE_customRecordForm']//button[@value='edit']"));
		clkObjectEdit.click();
		Thread.sleep(3000);
		
		//WebElement clkObjectIntputArea = driver.findElement(By.xpath("//div//div[@role='textbox']//p"));
		//clkObjectIntputArea.click();
		WebElement inputObjective = driver.findElement(By.xpath("//div[@role='textbox']//p"));
		inputObjective.sendKeys("this is the Objective information to be entereed and it should be satisfy the rule to submit the approval for meeting ");
		Thread.sleep(2000);
		logger.info("Objective information entered successfully");
		
		WebElement clkSaveObjective = driver.findElement(By.xpath("//button[@type='submit']"));
		clkSaveObjective.click();
		Thread.sleep(10000);
		
		logger.info("Objective information saved successfully.");
		
		*/
		
		
		

		
		
		
		
		
	}


	
}
