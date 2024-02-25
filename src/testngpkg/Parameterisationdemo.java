package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisationdemo {
	@Parameters({"email","pswd"})
	@Test
	public void main(String email,String pswd)
	{
		System.out.println("email="+email);
		System.out.println("pswd="+pswd);
	}
}
