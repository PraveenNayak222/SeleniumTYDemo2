package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        
        boolean res1 = driver.findElement(By.linkText("Register")).isDisplayed();
        if(res1)
        {
        	System.out.println("Demo web shop page is displayed");
        }
        else
        {
        	System.out.println("Demo web shop page is not displayed");
        	driver.quit();
        }  
        driver.findElement(By.linkText("Log in")).click();
        
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc125");
        
        driver.findElement(By.className("login-button")).click();
        boolean res2 = driver.findElement(By.className("validation-summary-errors")).isDisplayed();  
	    if(res2)
	    {
	    	System.out.println("Error message is displayed");
	    }
	    else
	    {
	    	System.out.println("Error message is not displayed");
	    }
	    driver.quit();
	}

}
