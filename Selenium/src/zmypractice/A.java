package zmypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev");
		
		driver.findElement(By.xpath("//span[text()='Blog']")).click();
		
		driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]")).click();
		
		
		
		driver.navigate().back();
		driver.navigate().back();
		
		
		

	}


}
