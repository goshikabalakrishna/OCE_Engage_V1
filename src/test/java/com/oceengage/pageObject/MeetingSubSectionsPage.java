package com.oceengage.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class MeetingSubSectionsPage {
	
	WebDriver ldriver;
	
	public MeetingSubSectionsPage(WebDriver rdriver)
	{
		rdriver = ldriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//input[@name=\"Meeting-search-input\"]")
	@CacheLookup
	WebElement meetingNameSearch;	
	@FindBy(xpath="//tbody/tr[1]/th[1]/span[1]/div[1]/lightning-primitive-custom-cell[1]/lst-output-lookup[1]/force-lookup[1]/div[1]/a[1]")
	@CacheLookup
	WebElement clickOnMeetingName;
	

	public void clickMeetingNameSearch(String mname)
	{
		meetingNameSearch.sendKeys(mname);
	}
	public void clickOnMeetingName()
	{
		clickOnMeetingName.click();
	}
	
}
