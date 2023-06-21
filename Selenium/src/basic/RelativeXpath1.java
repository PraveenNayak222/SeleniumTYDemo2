package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//xpath by attribute
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Praveen");
		
		//xpath by contains()-->attribute
		driver.findElement(By.xpath("//input[contains(@id,'Last')]")).sendKeys("N");
		Thread.sleep(2000);
		
		//xpath by group index
		driver.findElement(By.xpath("(//input[contains(@id,'mail')])[2]")).sendKeys("abcd@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234ty");
		
		driver.findElement(By.xpath("//input[contains(@id,'Confirm')]")).sendKeys("1234ty");
		
		driver.findElement(By.xpath("//input[contains(@id,'register')]")).click();
		
		driver.quit();

	}

}
