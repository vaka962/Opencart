  package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.AlertPage;
import testBase.BaseClass;


public class TC009_Simple_alert extends BaseClass {

	@Test(priority=0)
	public void verify_Simple_alert() throws InterruptedException  {
		logger.info("test started");
		
		AlertPage simalt=new AlertPage(driver);
		
		//simple alert
		
		simalt.btn_simpleAlt();
		logger.info("simple button clicked"); 
		
		Thread.sleep(3000);
		String act=simalt.txt_simpalt();
		logger.info("simple text captured");
		
		simalt.simple_alt();
		logger.info("simple accepted");
				
		String exp="I am an alert box!";
		
		Assert.assertEquals(exp, act);
		logger.info("simple test case passed");
	}
	
	
	@Test(priority=1)
	public void verify_confirmAlert() {
		
		AlertPage simalt=new AlertPage(driver);

		//Confirm alert
		
		simalt.clk_comAlt();
		logger.info("Confirm button clicked");
		
		 //Thread.sleep(3000);
	   String act1= simalt.txt_comalt();
	   logger.info("Confirm text captured");
	   
	   simalt.acct_comalt();;
	   logger.info("Confirm accepted");
		
		String exp1="Press a button!";
		
		Assert.assertEquals(exp1, act1);
		logger.info("comfirm test case passed");
	}

}
