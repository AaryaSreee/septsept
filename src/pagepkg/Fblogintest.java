package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Run All

public class Fblogintest extends Baseclass {
	

	@Test
//	Run|Debug
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("arya@gmail.com","arya123");
		ob.login();
		//driver.navigate().back();
	}
	
}
