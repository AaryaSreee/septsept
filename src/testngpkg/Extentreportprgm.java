package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Extentreportprgm {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
	reporter=new ExtentHtmlReporter("./reports/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","windows10");
	extent.setSystemInfo("testername","Arya");
	extent.setSystemInfo("Browser Name","chrome");
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setUp()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification() throws IOException
	{
		test=extent.createTest("Fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
		//sop("hello")
	}
		@Test
		public void fblogotest() throws IOException
		{
			test=extent.createTest("Fblogotest");
			boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
			Assert.assertTrue(b);
		}
		
		@AfterTest
		public void teardown()
		{
			extent.flush();
		}
		
		@AfterMethod
		public void browserclose(ITestResult result)throws IOException
		{
		
			if(result.getStatus()==ITestResult.FAILURE)
			{
				
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			String screenshotpath=screenshotpathMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			}else if(result.getStatus()==ITestResult.SKIP)
			{
				test.log(Status.SKIP,"TEST CASE SKIPPED IS"+result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, "TEST CASE PASSED IS"+result.getName());
			}
			
		}
		public static String screenshotpathMethod(WebDriver driver, String screenshotname)throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination="./Screenshot/"+screenshotname+".png";
			//File finaldestination=new File(destination);
			//FileHandler.copy(src,finaldestination);
			FileHandler.copy(src, new File(destination));
			return destination;
		}
		
}
