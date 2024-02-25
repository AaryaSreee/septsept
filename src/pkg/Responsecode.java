package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
	String u="https://www.facebook.com";
	
	@Test
	public void test()
	{
		try
		{
		URL link=new URL(u);
		HttpURLConnection con=(HttpURLConnection)link.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if(code==200) {
			System.out.println("response code is 200");
		}
		else
		{
			System.out.println("not 200");
		}
		}
		catch(Exception e)
		{
			
		}
		
	}

}
