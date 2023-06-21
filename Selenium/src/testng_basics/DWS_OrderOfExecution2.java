package testng_basics;

import org.testng.annotations.Test;

public class DWS_OrderOfExecution2 {
	@Test(priority=3)
	public void searchTest()
	{
		System.out.println("Executing SearchTest");
	}
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Executing LoginTest");
	}
	@Test(priority=1)
	public void registerTest()
	{
		System.out.println("Executing RegisterTest");
	}

}
