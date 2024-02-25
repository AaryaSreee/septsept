package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
		
		driver.get("https://www.google.com");
		
		
	}
	@Test
	public void test1()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void pagesrc()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail")) 
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
