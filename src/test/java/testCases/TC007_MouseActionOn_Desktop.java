package testCases;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.Desktoppage;
import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import testBase.BaseClass;

public class TC007_MouseActionOn_Desktop extends BaseClass {
	
	
	@Test(groups="master")
	public void mouseactiononDesktop() throws InterruptedException {
		
		logger.info("TC007_MouseActionOn_Desktop start");
		
		HomePage hp=new HomePage(driver);			
		hp.clkOnMyAccout();		
		hp.clkLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(p.getProperty("Email"));
		lp.setpassword(p.getProperty("Password"));
		lp.clklogin();
		Thread.sleep(3000);
		
		Desktoppage dp=new Desktoppage(driver);
		
		Actions myaction=new Actions(driver);
		myaction.moveToElement(dp.act_desktop_menu()).perform();
		dp.clk_dropdown_mac();
		
		Assert.assertTrue(dp.act_desktop_menu().isDisplayed(), "Desktop menu is not displayed");
		
		Thread.sleep(3000);
		logger.info("Test case passed");
	}

}
