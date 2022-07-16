package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testcontextsetup=testContextSetup;
	}
	// After Runs after every Scenario
	@After
	public void tearDown() throws IOException
	{
		
		testcontextsetup.baseClass.WebdriverManager().quit();
	}
	//AfterStep Runs After Each step in scenario
	
	@AfterStep
	public void screnShot(io.cucumber.java.Scenario scenario) throws IOException
	{
		WebDriver driver;
		driver=testcontextsetup.baseClass.WebdriverManager();
		if(scenario.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=	FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
		
	}

}
