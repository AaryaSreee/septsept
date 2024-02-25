package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbcreatetest extends Baseclass {

	
	
	
	@Test
	public void testlogin()
	{
		Fbcreatepage fp=new Fbcreatepage(driver);
		fp.createpageclick();
		fp.textcontains();
		fp.titleverification();
		fp.getStartedClick();
	}

}
