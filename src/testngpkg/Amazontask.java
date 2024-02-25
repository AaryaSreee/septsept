package testngpkg;

import java.time.Duration;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontask {
	
	ChromeDriver driver=new ChromeDriver();
	
	@BeforeTest
	public void setUp()
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		String exp="Amazon.in : mobilephones";
		
		if(exp.equals(actualtitle))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title is not same");
		}


	String parentWindow=driver.getWindowHandle();
	
	System.out.println("Parent window Title " +driver.getTitle());
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	Set<String> allWindowHandles=driver.getWindowHandles();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	for (String handle : allWindowHandles)
	{
		if(!handle.equalsIgnoreCase(parentWindow)){
			driver.switchTo().window(handle);
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			
		}
		driver.switchTo().window(parentWindow);
			
		}
	}
	
}
