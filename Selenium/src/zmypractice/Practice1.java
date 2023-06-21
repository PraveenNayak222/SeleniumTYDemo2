package zmypractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import practiceutility.Base;

public class Practice1 extends Base {
	@Test
	public void test1()
	{
		Reporter.log("test1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("test2",true);
	}

}
