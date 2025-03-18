package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.Handling_check_box;
import testBase.BaseClass;


public class TC008_Select_India_DropDown extends BaseClass {

	@Test
	public void select_india() throws Throwable {
		
		Handling_check_box cb=new Handling_check_box(driver);
		
		//'Actions act=new Actions(driver);
	
		String expected="India";
		cb.SelectbyVisText(expected);
		Thread.sleep(3000);
		
		Assert.assertEquals(expected, "India");
	}
}
