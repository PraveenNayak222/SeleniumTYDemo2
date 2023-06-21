package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Praveen");
		
		driver.findElement(By.id("LastName")).sendKeys("Nayak");
		
		driver.findElement(By.id("Email")).sendKeys("praveen.nayak222@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("Praveen123"); 
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Praveen123");
		
		driver.findElement(By.id("register-button")).click();
        
		driver.quit();
	}

}
