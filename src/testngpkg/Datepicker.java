package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker
{
	WebDriver driver;
	

	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.trivago.com/");
	
	}

	@Test
	public void datepickertest()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[1]")).click();	
		datepickermethod("January 2024","24");

	}
	public void datepickermethod(String expmonth, String expdate) 
	{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[25]/time")).getText();
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).click();
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement datelement:alldates)
		{
			String date=datelement.getText();
			if(date.equals(expdate))
			{
				datelement.click();
				break;
			}
		}
}
}




