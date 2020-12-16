package qumu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage {

	
	private By _itemTotalDisplayed = By.xpath("//*[@class='summary_subtotal_label']");
	
	private By _itemPrices = By.xpath("//*[@class='inventory_item_price']");
	
	private By _totalDisplayed = By.xpath("//*[@class='summary_total_label']");
	
	
	public double getItemTotalDisplayed() {
		String itemTotal = driver.findElement(_itemTotalDisplayed).getText();
		double displayedItemTotal = Double.parseDouble(itemTotal.substring(13));
	   return displayedItemTotal;
	}
	
	
	public double calculateTotalOfAllProducts() {
		 double totalCost = 0;
			List<WebElement> itemsPrices = driver.findElements(_itemPrices);
			 for(WebElement itemPrice : itemsPrices) {
			   totalCost += Double.parseDouble(itemPrice.getText().substring(1));
			 }
			 return totalCost;
	}
	
	public double calculateTaxOnItemTotal(int i) {
	 double totalTax = getItemTotalDisplayed() * i /100;
	  return 	Math.round(totalTax *100.0)/100.0;
	}
	
	public double calculateTotalAfterTax(int taxValue) {
		return getItemTotalDisplayed()+ calculateTaxOnItemTotal(taxValue);
		
	}
	
	public double getTotalDisplayed() {
	 String totalDisplayed = driver.findElement(_totalDisplayed).getText();

	 double  actualTotalDisplayed = Double.parseDouble(totalDisplayed.substring(8));
	 return actualTotalDisplayed;
	 
	}
	
	
}
