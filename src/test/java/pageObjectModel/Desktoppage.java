package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Desktoppage extends BasePage {
	
	WebDriver driver;
	//constructor
	
	public Desktoppage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath="//a[normalize-space()='Desktops']") 
	WebElement desktop;
	
	@FindBy(xpath="//a[normalize-space()='Mac (1)']")
	WebElement mac;
	
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myacc_menu;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	WebElement logout;
	
	//Action methods
	
	public  WebElement act_desktop_menu() {
		
		return desktop;
	}
	
	public void clk_desktop_menu() {
		desktop.click();
	}
	
	public void clk_dropdown_mac() {
		mac.click();
	}
	
	
	public void clk_myaccount() {
		myacc_menu.click();
	}
	
	public void clk_logout() {
		logout.click();
	}
	

}
