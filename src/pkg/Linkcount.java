package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		dr.get("http://www.google.com");
	}
	@Test
	public void open()
	{
		List<WebElement>linkDetails=dr.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkDetails.size());
		
	}
}
