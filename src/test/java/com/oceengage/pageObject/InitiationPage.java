package com.oceengage.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InitiationPage {
	
	WebDriver ldriver;
	
	public InitiationPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	//@FindBy(xpath="//a[@class=\"slds-context-bar__label-action dndItem\"]//following::span[text()=\"Meetings\"]")
	@FindBy(xpath="//button[contains(text(),'New Engagement')]")
	@CacheLookup
	WebElement btnMeeting;
	
	@FindBy(xpath="//div[contains(text(),'New')]")
	@CacheLookup
	WebElement btnNew;
	
	@FindBy(xpath="//div[@class='apo-radio-group__wrapper']//label[text()=\"Advisory Board\"]")
	@CacheLookup
	WebElement verifyRecordType;
	
	
	@FindBy(xpath="//label[text()='Advisory Board']//span[@class='apo-radio-group__checkmark']")
	@CacheLookup
	WebElement radioRecordType;

	//@FindBy(xpath="//div[contains(text(),'Next')]")
	@FindBy(xpath="//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[2]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]")
	WebElement btnNext1;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/flowruntime-flow[1]/flowruntime-lwc-body[1]/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[4]/flowruntime-aura-field[1]/div[1]/div[1]/div[2]/engage-apo-button[1]/button[1]")
	@CacheLookup
	WebElement btnNext2;
	
	@FindBy(xpath="//div[@class=\"slds-float_right slds-list--inline\"]//span//engage-apo-button//parent::span//following-sibling::engage-apo-button")
	@CacheLookup
	WebElement btnNext3;
	
	@FindBy(xpath="//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[3]/flowruntime-aura-field[1]/div[1]/engage-meeting-initiation-on-behalf-initiation[1]/c-meeting-initiation-edit-form[1]/c-apo-form-group[1]/div[1]/slot[1]/lightning-record-edit-form[1]/lightning-record-edit-form-create[1]/form[1]/slot[1]/slot[1]/div[1]/div[4]/c-custom-field[1]/c-advanced-input-lookup[1]/div[1]/div[1]/c-apo-input-list[1]/div[3]/div[1]/slot[1]/span[1]/c-apo-button[1]/button[1]/div[1]")
	@CacheLookup
	WebElement advanceSearch;
	
	@FindBy(xpath="//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[3]/flowruntime-aura-field[1]/div[1]/engage-meeting-initiation-on-behalf-initiation[1]/c-meeting-initiation-edit-form[1]/c-apo-form-group[1]/div[1]/slot[1]/lightning-record-edit-form[1]/lightning-record-edit-form-create[1]/form[1]/slot[1]/slot[1]/div[1]/div[4]/c-custom-field[1]/c-advanced-input-lookup[1]/div[1]/div[1]/c-apo-input-list[1]/div[3]/ul[1]/li[1]")
	@CacheLookup
	WebElement checkBusinessUnit;

	@FindBy(xpath="//flowruntime-lwc-body/div[1]/flowruntime-list-container[1]/div[1]/flowruntime-base-section[1]/div[1]/flowruntime-screen-field[3]/flowruntime-aura-field[1]/div[1]/engage-meeting-initiation-on-behalf-initiation[1]/c-meeting-initiation-edit-form[1]/c-apo-form-group[1]/div[1]/slot[1]/lightning-record-edit-form[1]/lightning-record-edit-form-create[1]/form[1]/slot[1]/slot[1]/div[1]/div[5]/c-custom-field[1]/c-advanced-input-lookup[1]/div[1]/div[1]/c-apo-input-list[1]/div[3]/ul[1]/li[1]")
	@CacheLookup
	WebElement checkPayer;
	



	
	@FindBy(xpath="//input[@name='Name']")
	@CacheLookup
	WebElement meetingName;
	
	
	@FindBy(xpath="//button[@name='AZ_Is_the_activity_promotional_in_nature__c']")
	@CacheLookup
	WebElement promotionNature;
	

	
	@FindBy(xpath="//input[@name='Planned_Number_Of_Experts__c']")
	@CacheLookup
	WebElement plannedExperts;
	

	
	
	
	public void clickMeeting()
	{
		btnMeeting.click();
	}
	public void clickNew()
	{
		btnNew.click();
	}
	public void clickRecordType()
	{
		radioRecordType.click();
	}
	public void clickNext1()
	{
		btnNext1.click();
	}
	public void clickNext2()
	{
		btnNext2.click();
	}
	public void clickNext3()
	{
		btnNext3.click();
	}
	public void clickAdvanceSearch()
	{
		advanceSearch.click();
	}
	public void clickBusinessUnit()
	{
		checkBusinessUnit.click();
	}
	public void clickPayer()
	{
		checkPayer.click();
	}

	public void inputMeetingName(String name)
	{
		meetingName.sendKeys(String.valueOf(name));
	}
	public void inputPlannedExperts(String number)
	{
		plannedExperts.sendKeys(String.valueOf(number));
	}	



}
