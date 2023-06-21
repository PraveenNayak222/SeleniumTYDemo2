package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Computers_012 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("praveen222nayak@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Accessories")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		boolean res = driver.findElement(By.linkText("TCP Coaching day")).isDisplayed();
		if(res)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
	}


