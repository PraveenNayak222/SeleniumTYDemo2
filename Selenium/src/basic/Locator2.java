package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		/*
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.partialLinkText("oppi")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.partialLinkText("Wish")).click();
		*/
		
		driver.findElement(By.className("search-box-text")).sendKeys("mobiles");
		driver.findElement(By.className("button-1")).click();
		
		driver.quit();
	}

}
