package pageObjectModel;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacPage extends BasePage {
	
	//constructor
	WebDriver driver;
	public MacPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath="//a[normalize-space()='iMac']")
	WebElement imac_item;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement img_mac;
	
	@FindBy(xpath="//button[@id=\"list-view\"][@class=\"btn btn-default active\"]")
	WebElement list_view;
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement addtocart;
	
	//Action methods
	
	public void clk_iMac_item() {
		imac_item.click();
	}
	
	public boolean sts_mac_img() {
		return img_mac.isDisplayed();
	}
	
	public void btn_listview() {
		list_view.click();
	}
	
	public void clk_addCart() {
		addtocart.click();;

		
	}

}
