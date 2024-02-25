package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprgm {

	public static void main(String[] args) {
		//chromedriver
		//edgedriver
		//firefoxdriver
		ChromeDriver driver=new ChromeDriver();//to launch browser
		driver.get("http://www.instagram.com");
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		String exp="Instagram";
		
		if(exp.equals(actualtitle))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title is not same");
		}
		driver.quit(); 
		
	}

}
