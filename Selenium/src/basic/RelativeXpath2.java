package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//xpath by text()
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//xpath by contains() -->text()
		boolean res = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).isDisplayed();
	    
		System.out.println(res);
		driver.quit();
	}

}
