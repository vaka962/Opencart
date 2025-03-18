package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.Desktoppage;
import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import pageObjectModel.MacPage;
import testBase.BaseClass;

public class TC004_selecting_item_in_desktop extends BaseClass {

	@Test(groups="master")
	public void selecting_item_inMac() {
		logger.info("Staring TC004 testcase");
		
        HomePage hp=new HomePage(driver);
		
		hp.clkOnMyAccout();
		hp.clkLogin();
		
		
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("entering username");
		lp.setusername(p.getProperty("Email"));
		
		logger.info("entering password");
		lp.setpassword(p.getProperty("Password"));
		
		lp.clklogin();
		logger.info("login success");
		
		Desktoppage desk=new Desktoppage(driver);
		
		desk.clk_desktop_menu();;
		logger.info("clicked on desktop menu");
		desk.clk_dropdown_mac();;
		logger.info("select mac dropdown");
		
		MacPage mp=new MacPage(driver);
		mp.clk_iMac_item();
		boolean status=mp.sts_mac_img();
		
		if(status==true) {
			logger.info("tast case pass");
			
			Assert.assertEquals(status, true);
		}else {
			Assert.assertEquals(status, false);
			logger.info("test case fail");
		}
		
	}
}
