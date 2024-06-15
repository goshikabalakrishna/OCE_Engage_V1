package com.oceengage.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.oceengage.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getAppURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\GBalakrishna\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		options.addArguments("--disable-notifications");
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		//logger.info("URL is Entered");
	}

	
	@AfterClass
	public void tearDown()
	{

		//driver.close();
		driver.quit();
		//logger.info("Browser closed successfully.");
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
}
