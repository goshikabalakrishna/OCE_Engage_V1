package com.oceengage.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="pw")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="Login")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="//header/div[2]/span[1]/div[2]/ul[1]/li[7]/span[1]/div[1]/button[1]/div[1]/span[1]/div[1]/span[1]")
	@CacheLookup
	WebElement userProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@id='error']")
	@CacheLookup
	WebElement errorold;
	
	@FindBy(xpath="Please check your username and password. If you still can't log in, contact your Salesforce administrator.")
	@CacheLookup
	WebElement error;
	
	@FindBy(name="username")
	@CacheLookup
	WebElement clearText;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
	public void clickUserProfile()
	{
		userProfile.click();
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	public String errorMessage() throws InterruptedException 
	{

		String message = error.getText();
		return message;
	}
	
	public void errorMsg() 
	
	{
		error.getText();
	}
	
	public void clearUserName()
	{
		clearText.clear();
	}
	
	

}
