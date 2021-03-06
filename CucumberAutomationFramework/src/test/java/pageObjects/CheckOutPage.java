package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")private WebElement checkOutButton;
	@FindBy(css="[alt='Cart']")private WebElement cartBag ;
	@FindBy(css=".promoBtn")private WebElement promoBtn ;
	@FindBy(xpath="//button[contains(text(),'Place Order')]")private WebElement placeOrder;
	
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void checkOutItems() throws InterruptedException
	{
		cartBag.click();
		Thread.sleep(2000);
		checkOutButton.click();
		
	}
	public boolean verifyPromeBtn() throws InterruptedException
	{
		return	promoBtn.isDisplayed();
		
	}
	public boolean verifyPlaceOrderBtn() throws InterruptedException
	{
		return	promoBtn.isDisplayed();
		
	}

}
