package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String reportname;
	
	public void onStart(ITestContext testContext) {
	    String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());  //time stamp in report
	    
	    reportname="Test-Report-"+timeStamp+".html";
	    sparkReporter=new ExtentSparkReporter(".\\reports\\"+ reportname); //specify location for report
	    
	    sparkReporter.config().setDocumentTitle("OpenCart Automation Report"); //Title of report
	    sparkReporter.config().setReportName("OpenCart Functional Testing"); //name of report
	    sparkReporter.config().setTheme(Theme.DARK);
	    
	    extent=new ExtentReports();
	    extent.attachReporter(sparkReporter);
	    extent.setSystemInfo("Application", "OpenCart");
	    extent.setSystemInfo("Module", "Admin");
	    extent.setSystemInfo("Sub Module", "Customers");
	    extent.setSystemInfo("User Name", System.getProperty("user.name"));
	    extent.setSystemInfo("Environment", "QA");
	    
	    String os= testContext.getCurrentXmlTest().getParameter("os");
	    extent.setSystemInfo("Operatin System", os);
	    
	    String browser=testContext.getCurrentXmlTest().getParameter("browser");
	    extent.setSystemInfo("Browser", browser);
	    
	    List<String> includeGroups = testContext.getCurrentXmlTest().getIncludedGroups();
	    if(!includeGroups.isEmpty()) {
	    	extent.setSystemInfo("Groups", includeGroups.toString());
	    }
	    
	    
	  }
	
	/*public void onTestStart(ITestResult result) {
	   
	  }*/
	   
    public void onTestSuccess(ITestResult result) {
    	
	  test=extent.createTest(result.getTestClass().getName());
	  test.assignCategory(result.getMethod().getGroups()); //Display groups in reports
	  test.log(Status.PASS,result.getName()+ "got successfully executed");
	  
    }

	 
	public void onTestFailure(ITestResult result) {
	   
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL, result.getName()+ "got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		 try {
			
			String imgPath=new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);	
		}
		catch( IOException e1)
		 {
			e1.printStackTrace();
		}
	  }

    public void onTestSkipped(ITestResult result) {
    	
    	test=extent.createTest(result.getTestClass().getName());
    	test.assignCategory(result.getMethod().getGroups());
    	
    	test.log(Status.SKIP,result.getName()+ "got Skiped");
    	test.log(Status.INFO,result.getThrowable().getMessage());
	    
	  }
    
    public void onFinish(ITestContext context) {
    	
    	extent.flush();
    	
    	String pathOfExtentReport=System.getProperty("user.dir")+ "\\reports\\" + reportname;
    	File extentReport=new File(pathOfExtentReport);
    	
    	try {
    		Desktop.getDesktop().browse(extentReport.toURI());
    	}catch(IOException e)
    	{
    		e.printStackTrace();
    	}
        
      }


}
