package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Computers_014 {

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
		
		driver.findElement(By.xpath("((//a[contains(text(),'Desktops')]))[4]")).click();
        //Thread.sleep(3000);
        
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]"))));
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]")).click();
        //Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@class='qty-input valid']")).sendKeys("2");
        driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		//Thread.sleep(2000);
		
		String title = driver.getTitle();
		if(title.contains("Simple"))
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

