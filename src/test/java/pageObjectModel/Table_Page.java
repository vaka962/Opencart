package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Table_Page extends BasePage{

	Select select;
	//Constructors
	public Table_Page(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='txtDate']")
	WebElement dateBox;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement years;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement months;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-w']")
	WebElement Backward_btn;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	WebElement Forward_btn;
	
	@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]//tr//td")
	List<WebElement> dates;
	
	//Actions 
	public void txt_date_box() {
		dateBox.click();
	}
	
	public String drdwn_year(String year) {
		select=new Select(years);
		select.selectByVisibleText(year);
		return year;	
	}
	
	public void sel_year() {
		years.click();
	}
	
	public void sel_month() {
		months.click();
	}
	
	public String drdwn_month(String month) {
		select=new Select(months);
		select.selectByVisibleText(month);
		return month;
	}
	
	public void btn_frd() {
		Forward_btn.click();
	}
	
	public void btn_bck() {
		Backward_btn.click();
	}
	
	public void selectDate(String day) {
		for (WebElement date : dates) {
			 if (date.getText().equals(day)) {
	                date.click();
	                break;
	            }
		}
	}
	
}
