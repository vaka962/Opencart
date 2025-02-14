package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePage {
	
	WebDriver driver;
	
	//Constructor
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement clk_logout;
	
	//Action Methods
	
	public boolean sts_Myaccount() {
		try {
		return(myaccount.isDisplayed());
		}
		catch(Exception e) {
			return(false);
		}	
	}
	
	public void clicklogout() {
		clk_logout.click();
	}
}
