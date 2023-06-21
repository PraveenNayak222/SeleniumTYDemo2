package frameworkutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	
	public WebDriver driver;
	@Parameters("URL")
	@BeforeClass 
	public void Browser_Setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Browser_Tear_Down()
	{
	   driver.close();	
	}
}
