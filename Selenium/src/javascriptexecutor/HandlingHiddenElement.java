package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("hide-textbox")).click();
			Thread.sleep(2000);
			
			WebElement hiddenTF=driver.findElement(By.id("displayed-text"));
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].value='hello';",hiddenTF );
			
			driver.findElement(By.id("show-textbox")).click();
			
			js.executeScript("window.scrollBy(0,100);");
	}

}
