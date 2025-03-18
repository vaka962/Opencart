package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dynamic_Button_Page extends BasePage {

    
	//Constructors
	public Dynamic_Button_Page(WebDriver driver) {
		super(driver);	
	}
	
	
	//Locators
	@FindBy(xpath="//button[starts-with(@name,'start')]")
	WebElement Start_Button;
	
	@FindBy(xpath="//button[starts-with(@name,'stop')]")
	WebElement Stop_Button;
	
	//Action Methods
	public void btn_Start() {
		Start_Button.click();
	}
	
	public void btn_Stop() {
		Stop_Button.click();
	}
	
	public boolean isStartButtonDisplayed() {
		return Start_Button.isDisplayed();
	}
	
	public boolean isStopButtonDisplayed() {
		return Stop_Button.isDisplayed();
	}

	

}
