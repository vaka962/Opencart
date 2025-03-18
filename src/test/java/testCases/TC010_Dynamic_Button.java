package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.Dynamic_Button_Page;
import testBase.BaseClass;

public class TC010_Dynamic_Button extends BaseClass{

	Dynamic_Button_Page dp;
	
	@Test(priority=1,groups="master")
	public void Verify_Dynamic_StartButton() {
		
		try {
		logger.info("Test Case Started for start");
		Dynamic_Button_Page dp=new Dynamic_Button_Page(driver);
		
		dp.btn_Start();
		logger.info("Clicked on button");
		
		
		logger.info(dp.isStopButtonDisplayed());
		
		Assert.assertEquals(dp.isStopButtonDisplayed(), true);
		logger.info("Passed");
		
		}catch(Exception e) {
			
			Assert.fail(e.getMessage());
			logger.info("failed");
		}
	}
		@Test(priority=2,groups="master")
		public void Verify_Dynamic_StopButton() throws InterruptedException {
			
			try {
			logger.info("Test Case Started for stop");
			dp=new Dynamic_Button_Page(driver);
			
			Thread.sleep(2000);
			dp.btn_Stop();
			Thread.sleep(2000);
			logger.info("Click on Stop");
			
			dp.isStartButtonDisplayed();
			
			logger.info(dp.isStartButtonDisplayed());
			
			logger.info("stoped");
			Thread.sleep(2000);
			Assert.assertEquals(dp.isStartButtonDisplayed(), true);
			
			logger.info("Passed");
			
			}catch(Exception e) {
				
				Assert.fail(e.getMessage());
				logger.info("failed");
			}
	}
	}
