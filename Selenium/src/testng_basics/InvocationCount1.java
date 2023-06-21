package testng_basics;

import org.testng.annotations.Test;

public class InvocationCount1 {
	@Test(invocationCount = 5)
	public void searchTest()
	{
		System.out.println("Executin SearchTest");
	}
}
