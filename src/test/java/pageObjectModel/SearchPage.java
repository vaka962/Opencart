package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	WebDriver driver;
	
	//Constructor
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//h1[normalize-space()='Search - mac']")
	WebElement message;
	
	//Action class
	
	public void txt_search(String value) {
		searchbox.sendKeys(value);
	}
	
	public void btn_search() {
		searchbutton.click();
	}
	
	public String com_msg() {
		return message.getText();
	}

}
