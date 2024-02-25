package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ebay 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
	driver.get("http://www.ebay.com");
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	String exp="ebay.com";
	
	if(exp.equals(actualtitle))
	{
		System.out.println("title is same");
	}
	else
	{
		System.out.println("title is not same");
	}
	driver.findElement(By.xpath("//button[@id=\"gh-shop-a\"]")).click();
	driver.findElement(By.xpath("//table[@id=\"gh-sbc\"]/tbody/tr/td/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//div[@id=\"leftnav\"]/div/div/div/section/ul/li/a")).click();
	driver.findElement(By.xpath("//li[@id=\"gh-minicart-hover\"]/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div/div/div[3]/a[2]")).click();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("books");
	driver.findElement(By.xpath("//*[contains(@name,'Shop by category')]"));
	//driver.quit(); 	
}
}