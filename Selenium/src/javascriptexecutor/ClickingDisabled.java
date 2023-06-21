package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingDisabled {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.oracle.com/in/java/technologies/downloads/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("jdk-8u371-linux-aarch64.rpm")).click();
			
			WebElement disabledLink = driver.findElement(By.linkText("Download jdk-8u371-linux-aarch64.rpm"));
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].click();", disabledLink); 
	}

}
