package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_Computers_002 {

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
            //Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
            driver.findElement(By.xpath("(//input[contains(@class,'button-2')])[2]")).click();
        	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();    
        	
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        	
        	WebElement countryLB = driver.findElement(By.id("CountryId"));
        	
        	Select s=new Select(countryLB);
        	
        	s.selectByVisibleText("India");
        	
        	driver.findElement(By.id("termsofservice")).click();
        	
        	driver.findElement(By.id("checkout")).click();
        	
        	String title = driver.getTitle();
        	
        	if(title.contains("Checkout"))
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
