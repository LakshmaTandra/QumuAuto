package qumu;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {
	
	private By _firstNameField = By.id("first-name");
	
	private By _lastNameField = By.id("last-name");
	
	private By _postalCodeField = By.id("postal-code");
	
	private By _clickContinueCTA = By.xpath("//*[@class='btn_primary cart_button']");
	
	
	
	public void enterFirstName(String firstName) {
		driver.findElement(_firstNameField).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		driver.findElement(_lastNameField).sendKeys(lastName);
	}
	
	public void enterPostalCode(String postcode) {
		driver.findElement(_postalCodeField).sendKeys(postcode);
	}
	
	public void clickOnContinueButton() {
		
		driver.findElement(_clickContinueCTA).click();
	}
	
	
	

}
