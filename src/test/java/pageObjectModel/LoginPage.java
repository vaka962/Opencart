package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
    //Constructor
	public LoginPage(WebDriver driver) {
	    super(driver);	
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;
	
	//Action methods
	
	public void setusername(String user) {
		txt_username.sendKeys(user);
	}
	
	public void setpassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void clklogin() {
		btn_login.click();
	}

}
