Feature: Place order for Product
	
	@Test1
  Scenario Outline: Search feature must be same for both Home and Offer Page
  Given User is already on GreenCart Landing Page
  And added "3" Items Into It
  Then User Proceed to checkout and Validate  the <Name> In Checkout page
  And Verify user has the ability to enter prome code and place the order
   Examples:
  | Names |
  | Tom   |
 