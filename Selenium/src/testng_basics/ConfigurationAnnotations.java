package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Executing beforeSuite()");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Executing afterSuite()");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Executing beforeTest()");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Executing afterTest()");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executing beforeClass()");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Executing afterClass()");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Executing beforeMethod()");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Executing afterMethod()");
	}
	@Test
	public void demoTest1()
	{
		System.out.println("Executing demoTest1()");
	}
	@Test
	public void demoTest2()
	{
		System.out.println("Executing demoTest2()");
	}

}
