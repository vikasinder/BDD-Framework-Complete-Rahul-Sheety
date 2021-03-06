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
import pageObjects.PageObjectManager;
import utils.TestContextSetup;




public class LandingPageStepDefinations {

	PageObjectManager pageManager;
	TestContextSetup contextSetupGlobal;
	public LandingPage landing;
	public LandingPageStepDefinations(TestContextSetup contextSetupLocal)
	{
		this.contextSetupGlobal=contextSetupLocal;
		this.landing=contextSetupGlobal.pageManager.getLandingPage();

	}
	
	@Given("User is already on GreenCart Landing Page")
	public void user_is_already_on_green_cart_landing_page() {
	
//	String Title=	landing.getTitle();	
//	Assert.assertEquals(Title, "GreenKart - veg and fruits kart");
	
	}

	@When("^User search with short name (.+) and extarcted actual name of product$")
	public void user_search_with_short_name_and_extarcted_actual_name_of_product(String value) throws InterruptedException {
	    
		
		//LandingPage landing=new LandingPage(contextSetupGlobal.driver);
		//pageManager=new PageObjectManager(contextSetupGlobal.driver);
		
		
		//Factory Design Pattern Is Implemented Here
		// As Even The Object of PageManager is Created In TestContextSetup Class
		landing.SearchItem(value);
		Thread.sleep(2000);
		   
		contextSetupGlobal.mainPageProductName= landing.getProductName().split("-")[0].trim();
		System.out.println("Main Page Product Name : " +   contextSetupGlobal.mainPageProductName);
		
	
	}


	@Given("added {string} Items Into It")
	public void added_items_into_it(String quantity) {

		landing.increment(Integer.parseInt(quantity));
		landing.addToCartButton();
}


}
