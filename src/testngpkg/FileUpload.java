package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload
{
	WebDriver driver;
	@BeforeTest
	public void Open()
	{
	driver=new ChromeDriver();
	}
	@Test
	public void setUp()
	{
	
	driver.get("https://demo.guru99.com/test/upload/");
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\geci\\Pictures\\Screenshots",Keys.ENTER);
	}
}
