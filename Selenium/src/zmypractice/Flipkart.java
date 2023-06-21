package zmypractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button")).click();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[contains(text(),'iPhone')])[1]"))));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'iPhone')])[1]")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		for (String obj:windows) {
			driver.switchTo().window(obj);
			if(driver.getTitle().contains("APPLE"))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button)[2]")).click();
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}

}
