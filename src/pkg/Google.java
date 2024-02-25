package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		//window maximize chyyan
		dr.manage().window().maximize();
	}
	@Test
	public void open()
	{
		dr.get("http://www.google.com");
		dr.findElement(By.id("APjFqb")).sendKeys("Books",Keys.ENTER);
		//dr.findElement(By.name("btnK")).click();
	}
	
}
