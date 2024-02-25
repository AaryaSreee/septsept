package testngpkg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDemo 
{
	@BeforeTest
	public void setUp()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
		
	}
	@Test(priority = 3,invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 1,enabled=false)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 2,dependsOnMethods = "test2")
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
