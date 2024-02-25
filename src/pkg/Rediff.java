package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
ChromeDriver dr;
@Before
public void setUp()
{
	dr=new ChromeDriver();
	dr.get("http:////register.rediff.com/register/register.php?FormName=user_details");

}
@Test

	public void logoDisplay()
	{
	WebElement logo=dr.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	boolean l=logo.isDisplayed();
	if(l)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
	
	}
@Test
public void buttontest()
{
	WebElement button=dr.findElement(By.xpath("//*[@id=\"Register\"]"));
	boolean e=button.isEnabled();
	if(e)
	{
		System.out.println("button is  enabled");
	}
	else
	{
		System.out.println("button is not enabled");
	}
	}

}
