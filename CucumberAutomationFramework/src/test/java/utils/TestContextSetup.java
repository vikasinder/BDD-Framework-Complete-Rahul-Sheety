package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String mainPageProductName;
	public PageObjectManager pageManager;
	public BaseClass baseClass;
	public GenericUtils generic;
	
	public TestContextSetup() throws IOException
	
	{
		baseClass= new BaseClass();
		pageManager=new PageObjectManager(baseClass.WebdriverManager());
		generic=new GenericUtils(baseClass.WebdriverManager());
	}

}
