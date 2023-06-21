package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Computers_003 {

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
            driver.findElement(By.xpath("(//input[contains(@class,'button-1')])[4]")).click();
            //Thread.sleep(2000);
            WebElement error = driver.findElement(By.xpath("//p[text()='Please select HDD']"));
	        
            if(error.isDisplayed())
            {
            	System.out.println("Pass");
            }
            else
            {
            	System.out.println("Fail");
            }
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//span[@title='Close']")).click();
            
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Log out"))));
            driver.findElement(By.linkText("Log out")).click();
        	driver.close();
	}

}
