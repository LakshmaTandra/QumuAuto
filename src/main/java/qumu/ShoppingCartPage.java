package qumu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.tools.xjc.Driver;

import junit.framework.Assert;

public class ShoppingCartPage extends BasePage {

	private By _quantityValue = By.xpath("//*[@class='cart_quantity']");
	
	private By _productsInCart = By.xpath("//*[@class='cart_item_label']/a/div");
	
	private By _checkOutButton = By.xpath("//*[@class='btn_action checkout_button']");
	
	
	
	
	public boolean verifyQuantityOfEachItem(int quantity) {
		 boolean flag = false;
		 
		 List<WebElement> itemQuantities =  driver.findElements(_quantityValue);
		 for(WebElement item : itemQuantities) {
			 if(Integer.parseInt(item.getText())!= quantity) {
				 flag = false;
				 break;
			 } else {
				 flag = true;
			 }
			
		 }
		 return flag;
	}
	
	
	public void removeItemFromShoppingCart(String product) {
		 List<WebElement> itemListInCart =  driver.findElements(_productsInCart);
		 for(int i=0;i< itemListInCart.size(); i++) {
			if( itemListInCart.get(i).getText().equalsIgnoreCase(product)){
				int g= i+1;
				String removeProductXpath = "(//*[@class='btn_secondary cart_button'])["+g+"]";
				 driver.findElement(By.xpath(removeProductXpath)).click();
			 }
		
	   }
	
	}
	
	public void clickOnCheckout() {
		driver.findElement(_checkOutButton).click();
	}
	
	
	
	
}
