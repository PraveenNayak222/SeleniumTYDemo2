package testng_basics;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups="regression")
	public void searchTest()
	{
		System.out.println("Executing SearchTest");
	}
	@Test(groups="SmokeTest")
	public void loginTest()
	{
		System.out.println("Executing LoginTest");
	}
	@Test(groups="SmokeTest")
	public void registerTest()
	{
		System.out.println("Executing RegisterTest");
	}
	
}
