package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		dr.get("file:///C:/Users/geci/Desktop/windows/Software%20Testing/ALERT.HTML");

	}
	@Test
	public void open()
	{
		dr.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=dr.switchTo().alert();
		String alerttext=a.getText();
				a.accept();
		System.out.println("alert text="+alerttext);
		//a.dismiss()-for cancel alert
		dr.findElement(By.xpath("/html/body/input[2]")).sendKeys("Arya");
		dr.findElement(By.xpath("/html/body/input[3]")).sendKeys("Raj");
}
}

