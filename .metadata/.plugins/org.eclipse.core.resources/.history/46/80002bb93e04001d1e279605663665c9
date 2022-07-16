Feature: Search and Place order for Product
	
	@Test2
  Scenario Outline: CheckOut feature must be same for both Home and Offer Page
  Given User is already on GreenCart Landing Page
  When User search with short name <Names> and extarcted actual name of product
  Then User search for <Names> same shortname in Offer Page to check if product exist
  And validate whether both product names are same
  Examples:
  | Names |
  | Tom   |
  | Beet  |