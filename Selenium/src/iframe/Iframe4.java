package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("file:///C:/Selenium/WebPages/iframe.html");
			
			driver.manage().window().maximize();
			
			WebElement frm = driver.findElement(By.id("FR1"));
			
			driver.switchTo().frame(frm);
			
			driver.findElement(By.id("small-searchterms")).sendKeys("Books");
			
			driver.findElement(By.className("button-1")).click();
			
			Thread.sleep(2000);
			
			driver.close();
	}

}
