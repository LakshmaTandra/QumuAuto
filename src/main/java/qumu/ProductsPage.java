package qumu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	private By _productName = By.className("inventory_item_name");
	
	private By _addToCartCTA = By.xpath("(//button[@class='btn_primary btn_inventory'])");
	
	private By _backButton = By.xpath("//*[@class='inventory_details_back_button']");
	
	private By _basketCount = By.xpath("//*[@class='fa-layers-counter shopping_cart_badge']");
	
	private By _shoppingCartLink = By.id("shopping_cart_container");
	
	public void addProductToCart(String product) {
		

		driver.findElement(By.linkText(product)).click();
		driver.findElement(_addToCartCTA).click();
		driver.findElement(_backButton).click();
		
		
		}
		
	public int getBasketCount() {
		
	 return	Integer.parseInt(driver.findElement(_basketCount).getText());
	}
	
	
	public void clickOnShoppingCart() {
		driver.findElement(_shoppingCartLink).click();
	}
	
	
}
