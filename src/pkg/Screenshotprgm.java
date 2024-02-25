package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		dr.get("file:///C:/Users/geci/Desktop/windows/Software%20Testing/ALERT.HTML");

	}
	@Test
	public void test() throws Exception
	{
		File s=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("D://screenshot1.png"));
		
		WebElement button=dr.findElement(By.xpath("/html/body/input[1]"));
		File s2=button.getScreenshotAs((OutputType.FILE));
		
		FileHandler.copy(s2, new File("./Screenshot/displaybtn.png"));
		
	}

}
