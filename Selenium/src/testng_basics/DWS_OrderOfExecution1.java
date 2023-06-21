package testng_basics;

import org.testng.annotations.Test;

public class DWS_OrderOfExecution1 {
	@Test
	public void searchTest()
	{
		System.out.println("Executing SearchTest");
	}
	@Test
	public void loginTest()
	{
		System.out.println("Executing LoginTest");
	}
	@Test
	public void registerTest()
	{
		System.out.println("Executing RegisterTest");
	}

}
