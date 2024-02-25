package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	
	ChromeDriver driver;

@Before
public void setUp()
{
	driver=new ChromeDriver();
}
@Test
public void test()
{
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arya@gmailcom");
}
@Test
public void pass()
{
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("arya43");
}
@Test
public void test3()
{
	driver.findElement(By.xpath("//button[@name='login']")).sendKeys("submit");
}
}
