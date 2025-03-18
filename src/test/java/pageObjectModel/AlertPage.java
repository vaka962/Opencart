package pageObjectModel;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AlertPage extends BasePage{
	
	public AlertPage(WebDriver driver) {
		super(driver);
		
	}

	
	//locators
	
	@FindBy(xpath="//button[@id='alertBtn']")
	WebElement simalt;
	
	@FindBy(xpath="//button[@id='confirmBtn']")
	WebElement cifalt;
	
	
	public void btn_simpleAlt() {
		simalt.click();
	}
	
	public String txt_simpalt() {
		Alert alt=driver.switchTo().alert();
		return alt.getText();
	}
	
	public void simple_alt() {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void clk_comAlt() {
		cifalt.click();
	}
	
	public String txt_comalt() {
		
		Alert alt=driver.switchTo().alert();
		return alt.getText();
	}
	
	public void acct_comalt() {
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	
	
}
