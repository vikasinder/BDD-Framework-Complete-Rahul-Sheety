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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;




public class CheckOutPageStepDefinations {

	PageObjectManager pageManager;
	TestContextSetup contextSetupGlobal;
	public CheckOutPage checkout;
	
	
	public CheckOutPageStepDefinations(TestContextSetup contextSetupLocal)
	{
		this.contextSetupGlobal=contextSetupLocal;
		checkout=contextSetupGlobal.pageManager.checkOutPage();
		
	}
	
	@Then("User Proceed to checkout and Validate  the <Name> In Checkout page")
	public void user_proceed_to_checkout_and_validate_the_name_in_checkout_page() throws InterruptedException {

	checkout.checkOutItems();
	Thread.sleep(2000);
	}

	
	@Then("Verify user has the ability to enter prome code and place the order")
	public void verify_user_has_the_ability_to_enter_prome_code_and_place_the_order() throws InterruptedException {
	  
	Assert.assertTrue(checkout.verifyPlaceOrderBtn());
	Assert.assertTrue(checkout.verifyPromeBtn());
	
	}



}
