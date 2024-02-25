package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleresponse {
ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		
		dr=new ChromeDriver();
		dr.get("http://www.google.com");
	}
	
	@Test
	public void open()
	{
		List<WebElement>linkDetails=dr.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkDetails.size());
		for(WebElement element:linkDetails)
		{
			String link=element.getAttribute("href");
		    verify(link);
		
		}
}

	private void verify(String link) {
		try
		{
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if(code==200)
		{
			System.out.println("response code is 200....."+link);
		}
		else if(code==404)
		{
			System.out.println("response code is 404....."+link);
		}
		else
		{
			System.out.println("not 200");
		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid link");
		}
	}
}