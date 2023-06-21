package testng_basics;

import org.testng.annotations.Test;

public class DWS_OrderofExecution3 {
	
	@Test(dependsOnMethods ="loginTest")
	public void searchTest()
	{
		System.out.println("Executing SearchTest");
	}
	@Test(dependsOnMethods = "registerTest")
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
