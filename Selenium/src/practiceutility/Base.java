package practiceutility;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("before suite",true);
	}
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("before class",true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("after class",true);
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("after suite",true);
	}
}
