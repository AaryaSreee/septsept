package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	
	WebDriver driver;
	@BeforeTest
	public void Open()
	{
	driver=new ChromeDriver();
	}
	@Test
	public void setUp()
	{
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	
	String expurl="https://practicetestautomation.com/logged-in-successfully/";
	String actualtitle=driver.getCurrentUrl();
	
	Assert.assertEquals(actualtitle,expurl);
	
	
	System.out.println("hello");
	
	
	}

	
	
}
