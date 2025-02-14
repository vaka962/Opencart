package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import pageObjectModel.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
     
	@Test(groups={"Sanity","Regression","Master"})
	public void verify_Login() {
		
		logger.info("Test case started");
		try {
		HomePage hp=new HomePage(driver);
		
		hp.clkOnMyAccout();
		hp.clkLogin();
		
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("enter email");
		lp.setusername(p.getProperty("Email"));
		
		logger.info("enter passward");
		lp.setpassword(p.getProperty("Password"));
		
		lp.clklogin();
		
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean status=map.sts_Myaccount();
		
		if(status==true) {	
			Assert.assertEquals(status, true);
			logger.info("test case pass");
		}else {
			Assert.assertEquals(status, true);
			//Assert.fail();
			logger.info("test case fail");
		}
		
		}
		catch(Exception e) {
			
			Assert.fail();
		}
	}
}
