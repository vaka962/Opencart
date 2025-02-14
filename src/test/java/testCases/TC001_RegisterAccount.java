package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.AccountRegisterPage;
import pageObjectModel.HomePage;
import testBase.BaseClass;


public class TC001_RegisterAccount extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void verify_RegisterAccount() {
		
		logger.info("*** TestCase Started ***");
		HomePage hp=new HomePage(driver);
		
		hp.clkOnMyAccout();
		logger.info("*** Clicked on My Account ***");
		
		hp.clkRegister();
		logger.info("*** Clicked on Register ***");
		
		logger.info("going to account registration page");
		AccountRegisterPage rp=new AccountRegisterPage(driver);
		
		logger.info("*** Entering Customer Details ***");
		rp.setFirstname(randomString());
		rp.setLastname(randomString());
		rp.setEmail(randomString()+"@gmail.com");	
		rp.setphonenumber(randomNumaric());
		
		String password=randomAlphaNumaric();
		
		rp.setpassword(password);
		rp.setconfpassword(password);
		
		rp.clickcheckbox();
		rp.clickcontinue();
		
		logger.info("*** Clicked on Continue ***");
		String conmsg=rp.getConfirmmsg();
		
		
		if(conmsg.equals("Your Account Has Been Created!")) {
			logger.info("*** Test Case Passed ***");
			Assert.assertTrue(true);
		}else {
			//logger.info("*** Test Case Failed ***");
			logger.error("*** Test Case Failed ***");
			Assert.fail();
		}
		
		//Assert.assertEquals(conmsg, "Your Account Has Been Created!000");	
		//logger.info("*** Test Case Passed ***");
		
		
	}
}
