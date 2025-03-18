package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Handling_check_box extends BasePage{
	
	WebDriver driver;
	Actions act;
	//Constructor
	public Handling_check_box(WebDriver driver) {
		super(driver);
		act=new Actions(driver);
	}
	
	//Locators
	@FindBy(xpath="//select[@id=\"country\"]")
	WebElement country_dropdown;
	
	
	
	//Actions Methods
	public void actions() {
		act.moveToElement(country_dropdown).perform();
	}
	
	public void SelectbyVisText(String Visibletext) {
		Select sel=new Select(country_dropdown);
		sel.selectByVisibleText(Visibletext);
	}
	
	

}
