package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {
	
	WebDriver driver;
	
	//Constructor
	
	public AccountRegisterPage(WebDriver driver){
		
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txt_Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txt_Lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txt_phonenumber;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txt_ConfPassword;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkbox;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btn_continue;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement alt_message;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement cnfmsg;
	
	//Action Methods
	
	public void setFirstname(String fname) {
		txt_Firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txt_Lastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void setphonenumber(String num) {
		txt_phonenumber.sendKeys(num);
	}
	
	public void setpassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void setconfpassword(String compassword) {
		txt_ConfPassword.sendKeys(compassword);
	}
	
	public void clickcheckbox() {
		chkbox.click();
	}
	
	public void clickcontinue() {
		btn_continue.click();
	}
	
	public String warningmsg() {
		try {
			return(alt_message.getText());
		}catch(Exception e){
			return(e.getMessage());
		}
	}
	
	public String getConfirmmsg() {
		try {
			return(cnfmsg.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}

}
