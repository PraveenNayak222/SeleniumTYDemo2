package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/iframe.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	 

}
