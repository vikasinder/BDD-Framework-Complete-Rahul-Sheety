package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='search']")private WebElement search;
	@FindBy(css="h4.product-name")private WebElement productName;
	@FindBy(linkText = "Top Deals")private WebElement TopDeals;

	@FindBy(css = "a.increment")private WebElement Increment;
	@FindBy(css = ".product-action button")private WebElement addToCART;

	
	public LandingPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	
	public void SearchItem(String name) {
		
		search.sendKeys(name);
	}
	
	public String getProductName() {
		
		return	productName.getText();
	}

	public void topDealsClick() {
		
		TopDeals.click();
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}

	
	public void  increment(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			Increment.click();
			i--;
		}
	}
	
	public void addToCartButton()
	{
		addToCART.click();
	}



}
