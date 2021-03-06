package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private WebDriver driver;
	
	public WebDriver WebdriverManager() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//Global.properties");	
		Properties prop=new Properties();
		prop.load(file);
		String url=prop.getProperty("url");
		String browser_from_propertiesfile=prop.getProperty("Browser");
		String browser_from_mvncommandline=System.getProperty("Browser");
		
		// If From command line some browser value is passed then that will be executed else global properties value will be executed
		
		String browser= browser_from_mvncommandline!=null ? browser_from_mvncommandline:browser_from_propertiesfile;
		
		
		
		if(driver==null) 
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
					driver= new ChromeDriver();
			}
			else if
			(browser.equalsIgnoreCase("firefox"))
			{
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//firefoxdriver.exe");
					driver= new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
		}
		return driver;
	}

}
