package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void Open() throws InterruptedException
	{
		driver.get("http://Amazon.in");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id=\"nav-tools\"]/a[4]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[6]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id=\"s-refinements\"]/div[2]/ul/li/span/a")).click();
		Thread.sleep(6000);
	}
}
   