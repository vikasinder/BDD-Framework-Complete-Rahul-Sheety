package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public  WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchWindowToChild()
	{
		Set<String> S1= driver.getWindowHandles();
		// iterator is used to iterate windows
		Iterator<String> i1= S1.iterator();
		//Iterator starts with 0 , so to get parent window which is 1 we have to use i1.next()
		String parentWindow=i1.next();
		String childWindow=i1.next();
		driver.switchTo().window(childWindow);
	}

}
