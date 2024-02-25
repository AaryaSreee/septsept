package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonVerification 
{
ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		dr.get("http:////register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void open()
	{
		String buttontext=dr.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");	
			}
		}
	
}
