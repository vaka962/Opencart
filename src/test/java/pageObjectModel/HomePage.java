package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	//Constructor
	
	public HomePage(WebDriver driver){
		
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
	WebElement lnkLogin;
	
	//Action Methods
	
	public void clkOnMyAccout() {
		
		lnkMyAccount.click();
	}
	
	public void clkRegister() {
		lnkRegister.click();
	}
	
	public void clkLogin() {
		lnkLogin.click();
	}

}
