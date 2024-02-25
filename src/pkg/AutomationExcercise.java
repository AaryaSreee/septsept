package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExcercise {

	ChromeDriver dr;
	@Before
	public void setUp()
	{
		dr=new ChromeDriver();
		dr.get("https://automationexercise.com/login");
	}

	@Test
	public void test()
	
	{
		dr.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Arya");
		dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("aaryaasreee91@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		dr.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		
		WebElement day=dr.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("13");
		
		WebElement month=dr.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("May");
		
		WebElement year=dr.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("1997");
		
		dr.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Arya");
		dr.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Raj");
		dr.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("RedRoss");
		dr.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("GrrenVilla12");
		dr.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Yellowcity");
		WebElement country=dr.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countrydetails=new Select(country);
		countrydetails.selectByValue("India");
		dr.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		dr.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kottarakkara");
		dr.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("658834");
		dr.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("6281543245");
		
		dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
		@Test
		public void count()
		
		{
			{
				List<WebElement>linkDetails=dr.findElements(By.tagName("a"));
				System.out.println("Total no of links="+linkDetails.size());
				
				
				for(WebElement element:linkDetails)
				{
					String link=element.getAttribute("href");
					String linktext=element.getText();
					System.out.println("link="+link);
					System.out.println("text="+linktext);
				}
		}
		
	}
	
	
}
