package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import qumu.BasePage;

public class CheckoutOverviewPage extends BasePage {

	
	private By _itemTotalDisplayed = By.xpath("//*[@class='summary_subtotal_label']");
	
	private By _itemPrices = By.xpath("//*[@class='inventory_item_price']");
	
	private By _totalDisplayed = By.xpath("//*[@class='summary_total_label']");
	
	
	
	
	// returns the total of all items displayed on page
	
	public double getItemTotalDisplayed() {
		String itemTotal = driver.findElement(_itemTotalDisplayed).getText();
		double displayedItemTotal = Double.parseDouble(itemTotal.substring(13));
	   return displayedItemTotal;
	}
	
	
	
	
	// Calculates totol of all items displayed on the page and returns as a double value.
	
	public double calculateTotalOfAllProducts() {
		 double totalCost = 0;
			List<WebElement> itemsPrices = driver.findElements(_itemPrices);
			 for(WebElement itemPrice : itemsPrices) {
			   totalCost += Double.parseDouble(itemPrice.getText().substring(1));
			 }
			 return totalCost;
	}
	
	
	
	
	// Calculates the tax based on the value passed in as argument.
	
	public double calculateTaxOnItemTotal(int i) {
	 double totalTax = getItemTotalDisplayed() * i /100;
	  return 	Math.round(totalTax *100.0)/100.0;
	}
	
	
	
	// calculates and returns total value after Tax applied.
	
	public double calculateTotalAfterTax(int taxValue) {
		return getItemTotalDisplayed()+ calculateTaxOnItemTotal(taxValue);
		
	}
	
	
	
	
	// Gets the total value displayed on page.
	
	public double getTotalDisplayed() {
	 String totalDisplayed = driver.findElement(_totalDisplayed).getText();

	 double  actualTotalDisplayed = Double.parseDouble(totalDisplayed.substring(8));
	 return actualTotalDisplayed;
	 
	}
	
	
}
