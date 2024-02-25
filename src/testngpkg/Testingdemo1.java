package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingdemo1 
{
	ChromeDriver dr;
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		 dr = new ChromeDriver();
	}
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		dr.get("https://www.facebook.com");
		
	}
	@Test(priority = 3,groups = {"smoke","sanity"})
	public void test1()
	{
		String title=dr.getTitle();
		System.out.println(title);
	}
	@Test(priority = 1,dependsOnMethods = "test1",groups = {"sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 2,groups = {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermtd()
	{
		System.out.println("after method details");
	}
	@AfterTest 
	public void tearDown()
	{
		System.out.println("browser quit");	
		
	}

}
