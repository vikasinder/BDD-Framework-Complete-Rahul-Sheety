package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

	
	@FindBy(xpath="//input[@type='search']")private WebElement OfferPagesearch;
	@FindBy(css=("tr td:nth-child(1)"))private WebElement offerProductName;

	
	public OfferPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SearchItem(String name) {
		
		OfferPagesearch.sendKeys(name);
	}
	
	public String getProductName() {
		
		return	offerProductName.getText();
	}

	
	
}
