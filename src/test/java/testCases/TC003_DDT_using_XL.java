package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import pageObjectModel.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_DDT_using_XL extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DataDriven")
	public void verify_XL_loginData(String email,String pwd,String expresult)
	{
		logger.info("Test case Starting");
		
		//homepage 
		HomePage hp=new HomePage(driver);
		hp.clkOnMyAccout();
		hp.clkLogin();
		
		//login page
		LoginPage lp=new LoginPage(driver);
		
		logger.info("enter email");
		lp.setusername(email);
		
		logger.info("enter passward");
		lp.setpassword(pwd);
		
		lp.clklogin();
		
		//MyAccount page
		MyAccountPage map=new MyAccountPage(driver);
		boolean status=map.sts_Myaccount();
		
		logger.info("Compering valid and invalid data from Excel");
		
		if(expresult.equalsIgnoreCase("Valid")) {
			if(status==true) {
				map.clicklogout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(expresult.equalsIgnoreCase("Invalid")) {
			if(status==true) {
				map.clicklogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}		
		}
		logger.info("Test case completed");	
	}
	

}
