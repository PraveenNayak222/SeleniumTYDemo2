package testng_basics;

import org.testng.annotations.Test;

public class Include1 {
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
	@Test
	public void subscribeTest()
	{
		System.out.println("Executing subscribeTest");
	}

}
