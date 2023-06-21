package testng_basics;

import org.testng.annotations.Test;

public class Groups2 {
	@Test(groups="regression")
	public void subscribeTest()
	{
		System.out.println("Executing subscribeTest");
	}
	@Test(groups="SmokeTest")
	public void voteTest()
	{
		System.out.println("Executing VoteTest");
	}
}
