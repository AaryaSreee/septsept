package testngpkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTesting {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	System.out.println("browser open");
}
@BeforeMethod
public void urlloading()
{
	driver.get("http://Amazon.in");
	
}
@Test(priority = 3,invocationCount = 3)
public void test1()
{
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	String exp="Instagram";
	
	if(exp.equals(actualtitle))
	{
		System.out.println("title is same");
	}
	else
	{
		System.out.println("title is not same");
	}
}
@Test(priority = 1,enabled=false)
public void test2()
{
	System.out.println("test2");
}
}

