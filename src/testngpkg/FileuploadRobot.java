package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadRobot {
	WebDriver driver;
	@BeforeTest
	public void Open()
	{
	driver=new ChromeDriver();
	}
	@Test
	public void fileupload() throws Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();//button click
		
		
		fileuploadprgm("C:\\Users\\geci\\Desktop\\windows\\DA LAB cycle_fin.docx");//creating an object for uploading file
		
		
		

	}
	public void fileuploadprgm(String p) throws AWTException
	{
		StringSelection strSelection=new StringSelection(p);//storing file uploading to p
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);//copying to clip board
		
		
		Robot robot=new Robot();//40-48 pasting the copied item
		
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		
		
			
	}

}

