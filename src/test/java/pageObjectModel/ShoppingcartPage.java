package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingcartPage extends BasePage {

	//constructor
	WebDriver driver;
	public ShoppingcartPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shopingcart;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement update_cart;
	
	@FindBy(xpath="//div[@class=\"input-group btn-block\"]//input[@type=\"text\"]")
	WebElement qty;
	
	@FindBy(xpath="//div[@class=\"col-sm-4 col-sm-offset-8\"]//table[@class=\"table table-bordered\"]//tr[4]//td[2]")
	WebElement maccost;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	WebElement continue_btn;
	
	//Action methods
	
	public void clk_shoppingcart() {
		shopingcart.click();
	}
	
	public void upd_cart() {
		update_cart.click();
	}
	
	public void txt_Qty() {
		qty.clear();
		qty.sendKeys("1");
	}
	
	public void btn_continue() {
		continue_btn.click();
	}
	
	public String txt_Mac_price() {
		return maccost.getText();
	}
}
