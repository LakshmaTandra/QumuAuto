package qumu;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pages.CheckoutOverviewPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductsPage;
import pages.ShoppingCartPage;

public class UITestStepDefinitions extends BasePage {

	HomePage homePage;
	ProductsPage productPage;
	ShoppingCartPage shoppingCartPage;
	CheckoutPage checkoutPage;
	CheckoutOverviewPage checkoutOverviewPage;

	@Given("^I am on the home page$")
	public void iAmOnTheHomePage() {
		homePage = new HomePage();
		homePage.gethomePage();
	}

	@And("^I login in with the following details$")
	public void i_login_in_with_the_following_details(DataTable loginCredentials) throws Throwable {
		List<List<String>> data = loginCredentials.raw();
		homePage.login(data.get(1).get(0), data.get(1).get(1));

	}

	@And("^I add the following items to the basket$")
	public void i_add_the_following_items_to_the_basket(DataTable itemsList) throws Throwable {
		productPage = new ProductsPage();
		List<List<String>> items = itemsList.raw();
		for (int i = 0; i < items.size(); i++) {
			String item = items.get(i).get(0);
			productPage.addProductToCart(item);
		}

	}

	@And("^I  should see (\\d+) items added to the shopping cart$")
	public void i_should_see_items_added_to_the_shopping_cart(int count) throws Throwable {
		int itemsInCart = productPage.getBasketCount();
		Assert.assertEquals(count, itemsInCart);
	}

	@And("^I click on the shopping cart$")
	public void i_click_on_the_shopping_cart() throws Throwable {
		productPage.clickOnShoppingCart();
	}

	@And("^I verify that the QTY count for each item should be (\\d+)$")
	public void i_verify_that_the_QTY_count_for_each_item_should_be(int quantityValue) throws Throwable {
		shoppingCartPage = new ShoppingCartPage();
		Assert.assertTrue("Quantity of products in shopping cart is not equal to :" + quantityValue,
				shoppingCartPage.verifyQuantityOfEachItem(quantityValue));

	}

	@And("^I remove the following item:$")
	public void i_remove_the_following_item(DataTable itemName) throws Throwable {
		List<List<String>> product = itemName.raw();
		shoppingCartPage.removeItemFromShoppingCart(product.get(0).get(0));

	}

	@And("^I click on the CHECKOUT button$")
	public void i_click_on_the_CHECKOUT_button() throws Throwable {
		shoppingCartPage.clickOnCheckout();

	}

	@And("^I type \"([^\"]*)\" for First Name$")
	public void i_type_for_First_Name(String firstName) throws Throwable {
		checkoutPage = new CheckoutPage();
		checkoutPage.enterFirstName(firstName);
	}

	@And("^I type \"([^\"]*)\" for Last Name$")
	public void i_type_for_Last_Name(String lastName) throws Throwable {
		checkoutPage.enterLastName(lastName);
	}

	@And("^I type \"([^\"]*)\" for ZIP/Postal Code$")
	public void i_type_for_ZIP_Postal_Code(String postalCode) throws Throwable {
		checkoutPage.enterPostalCode(postalCode);
	}

	@When("^I click on the CONTINUE button$")
	public void i_click_on_the_CONTINUE_button() throws Throwable {
		checkoutPage.clickOnContinueButton();
	}

	@Then("^Item total will be equal to the total of items on the list$")
	public void item_total_will_be_equal_to_the_total_of_items_on_the_list() throws Throwable {
		checkoutOverviewPage = new CheckoutOverviewPage();
		Assert.assertEquals(checkoutOverviewPage.getItemTotalDisplayed(),
				checkoutOverviewPage.calculateTotalOfAllProducts());

	}

	@And("^a Tax rate of (\\d+) % is applied to the total$")
	public void a_Tax_rate_of_is_applied_to_the_total(int taxRate) throws Throwable {
		Assert.assertEquals(checkoutOverviewPage.calculateTotalAfterTax(taxRate),
				checkoutOverviewPage.getTotalDisplayed());
	}
}
