package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import pageObjectModel.SearchPage;
import testBase.BaseClass;

public class TC006_Verifying_Search extends BaseClass{
	
	@Test(priority=0,groups="master")
	public void homepage() {
		
		logger.info("TC006 Test Case Started");
		
		HomePage hp=new HomePage(driver);
		hp.clkOnMyAccout();
		hp.clkLogin();
	}
	
	@Test(priority=1,groups="master")
	public void loginpage() {
		
		logger.info("Entering into login page");
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(p.getProperty("Email"));
		lp.setpassword(p.getProperty("Password"));
		lp.clklogin();
		
		logger.info("Login success");
	}
	
	@Test(priority=2,groups="master")
	public void verify_searchPage() {
		
		logger.info("Entering value in search");
		
		SearchPage sp=new SearchPage(driver);
		logger.info("Entering values to search box");
		sp.txt_search("mac");
		sp.btn_search();
		
		String conf_msg=sp.com_msg();
		
		if(conf_msg.equals("Search - mac")) {
			logger.info("Test case Pass");
			Assert.assertTrue(true);
		}else {
			logger.info("Test case Fail");
			Assert.assertTrue(false);
		}
		
		
	}

}
