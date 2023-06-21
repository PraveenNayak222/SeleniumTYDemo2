package zmypractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void demoScreenShot() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("./ScreenShots/FirstScreenshot1.png");
			
			FileHandler.copy(temp, dest);
			
			//FileUtils.copyFile(temp, dest);
			
			driver.close();
	}

}
