package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Fbcreatepage {
	WebDriver driver;
	
	
	
	@FindBy(linkText="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepagelink;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button")
	WebElement fbGetStartedButton;
	//By fbcreatepagelink=By.linkText("create a page");
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		Assert.assertEquals("Forgotpaswd",actualtitle);
	}
	
	public void createpageclick()
	{
	fbcreatepagelink.click();
	}
	
	public void textcontains() {
		String exp="Create a Page";
		String act=driver.getPageSource();
		if(act.contains(exp))
		{
			System.out.println("Text is present");
		}
		else {
			System.out.println("text is not present");
		}
		}
	public void getStartedClick()
	{
		fbGetStartedButton.click();
	}

}
