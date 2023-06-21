package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert4 {
	@Test
	public void demoHardAssert()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "fb","Title Verification");
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		ast.assertAll();	
		
		driver.close();
	}
}
