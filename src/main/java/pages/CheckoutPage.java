package pages;

import org.openqa.selenium.By;

import qumu.BasePage;

public class CheckoutPage extends BasePage {
	
	private By _firstNameField = By.id("first-name");
	
	private By _lastNameField = By.id("last-name");
	
	private By _postalCodeField = By.id("postal-code");
	
	private By _clickContinueCTA = By.xpath("//*[@class='btn_primary cart_button']");
	
	
	// Method to enter Firstname
	
	public void enterFirstName(String firstName) {
		driver.findElement(_firstNameField).sendKeys(firstName);
	}
	
	// Method to enter lastname
	public void enterLastName(String lastName) {
		driver.findElement(_lastNameField).sendKeys(lastName);
	}
	
	// Method to enter postcode
	public void enterPostalCode(String postcode) {
		driver.findElement(_postalCodeField).sendKeys(postcode);
	}
	
	// Method to click on continue after entering all details.
	public void clickOnContinueButton() {
		
		driver.findElement(_clickContinueCTA).click();
	}
	
	
	

}
