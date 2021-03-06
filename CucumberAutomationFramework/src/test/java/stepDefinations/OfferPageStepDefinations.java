package stepDefinations;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefinations {
	
	String nextPageProductName;
	TestContextSetup contextSetupGlobal;
	
	public OfferPageStepDefinations(TestContextSetup contextSetupLocal)
	{
		this.contextSetupGlobal=contextSetupLocal;
		
	}
	
	
	@Then("^User search for (.+) same shortname in Offer Page to check if product exist$")
	public void user_search_for_same_shortname_in_offer_page_to_check_if_product_exist(String value) throws InterruptedException {
		 
		
		switched();
		
		OfferPage offer=contextSetupGlobal.pageManager.getOfferPage();
		
		offer.SearchItem(value);
		
		Thread.sleep(2000);
		   
		nextPageProductName=offer.getProductName();
	
	}
	
	
	public void switched()
	{
		LandingPage landing=contextSetupGlobal.pageManager.getLandingPage();
		landing.topDealsClick();
		//As it is opening a new window on click , we have to use getwindow handles
		contextSetupGlobal.generic.switchWindowToChild();
	
	}
	@Then("validate whether both product names are same")
	public void validate_whether_both_product_names_are_same() {
	
		
		Assert.assertEquals(contextSetupGlobal.mainPageProductName, nextPageProductName);
	
	
	
	}

}
