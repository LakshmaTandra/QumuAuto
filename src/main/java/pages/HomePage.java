package pages;

import org.openqa.selenium.By;

import qumu.BasePage;
import qumu.LoadProp;

public class HomePage extends BasePage {

	
	
    private	By _username = By.id("user-name");	
	private By _password = By.id("password");
	private By _loginLink = By.id("login-button");
	
	
	
    public void gethomePage() {
        driver.get(LoadProp.getproperty("url"));
    	
    }
    
    
    public void  enterUserName (String username) {
    	driver.findElement(_username).sendKeys(username);
    	
    }
    
    public void  enterPassWord (String password) {
    	driver.findElement(_password).sendKeys(password);
    }
    
    public void clickLoginButton() {
    	driver.findElement(_loginLink).click();
    }
    
    
    // Method takes 2 arguments username and password and clicks on logni button.
    public void login(String username, String password ) {
    	enterUserName(username);
    	enterPassWord(password);
    	clickLoginButton();
    }
    
    
}
