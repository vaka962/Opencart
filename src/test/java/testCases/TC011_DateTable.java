package testCases;

import org.testng.annotations.Test;

import pageObjectModel.Table_Page;
import testBase.BaseClass;

public class TC011_DateTable extends BaseClass {

	@Test
	public void Select_Date() throws InterruptedException {
		String date="5";
		String month="Oct";
		String year="2023";
		
		Table_Page tb=new Table_Page(driver);
		tb.txt_date_box();
		
		tb.sel_year();
		tb.drdwn_year(year);
		
		tb.sel_month();
		tb.drdwn_month(month);
		
		Thread.sleep(2000);
		tb.selectDate(date);
		}	
	}

