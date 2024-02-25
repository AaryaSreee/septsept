package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com");
		FileInputStream f=new FileInputStream("‪C:\\Users\\geci\\Desktop\\WORKSHEET\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet s=wb.getSheet("Sheet1");
		int rowcount=s.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			String password=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username+"/n"+"password="+password);
			driver.findElement(By.id("//*[@id=\"email\"]")).clear();
			driver.findElement(By.id("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.id("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.id("//*[@id=\"u_0_5_Tt\"]")).click();
			}
	}

}
