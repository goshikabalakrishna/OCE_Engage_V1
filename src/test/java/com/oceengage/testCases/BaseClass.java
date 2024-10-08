package com.oceengage.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.oceengage.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getAppURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String meetingname=readconfig.getMeetingName();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(10));
		chromeOptions.addArguments("force-device-scale-factor=0.95");
		//chromeOptions.addArguments("--disable-notifications");
		//chromeOptions.setUnhandledPromptBehaviour(org.openqa.selenium.UnexpectedAlertBehaviour.ACCEPT);
		
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.destructivelyEnsureCleanSession(); // Clear cache before launching the browser
        ieOptions.setAcceptInsecureCerts(true);

        
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setAcceptInsecureCerts(true);
        edgeOptions.addArguments("--disable-notifications");
        edgeOptions.addArguments("force-device-scale-factor=0.95");
        edgeOptions.addArguments("high-dpi-support=0.95");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		caps.getBrowserName();
		//options.merge(caps);
		
		logger=Logger.getLogger("OCE_Engage_V1");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
				driver= new ChromeDriver();

		}
		
		else if(br.equals("firefox"))
		{
				System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
				driver= new FirefoxDriver();			
		}
		
		else if(br.equals("ie"))
		{
				System.setProperty("webdriver.ie.driver", readconfig.getiePath());
				driver= new EdgeDriver();			
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		
		//logger.info("URL is Entered");
	}

	@AfterClass
	public void tearDown()
	{
		//driver.close();
		//driver.quit();
		//logger.info("Browser closed successfully.");
	}
	
	public void waitUntilObjectVisible(By object, int time)
	{
		Duration timeout = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(object));
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{		
		//File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + "_" + timeStamp +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");		
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
