package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters2 {
	@Parameters({"URL","Search"})
	@Test
	public void multipleParamDemo(String url,String search)
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("small-searchterms")).sendKeys(search);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.close();
	}

}
