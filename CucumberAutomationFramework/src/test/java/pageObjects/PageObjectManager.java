package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
 
	private LandingPage landingPage;
	private OfferPage offerPage;
	private CheckOutPage checkOut;

	private WebDriver driver;
	
	public PageObjectManager(WebDriver Driver)
	{
		this.driver=Driver;	
	}
	
	public  LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
		
	}
	
	public  OfferPage getOfferPage()
	{
		offerPage=new OfferPage(driver);
		return offerPage;
		
	}
	public  CheckOutPage checkOutPage()
	{
		checkOut=new CheckOutPage(driver);
		return checkOut;
		
	}
}
