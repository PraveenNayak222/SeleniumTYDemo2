package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Computers_010 {

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
        
        driver.findElement(By.linkText("Desktop PC with CDRW")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //Thread.sleep(2000);
        
        driver.findElement(By.id("FriendEmail")).sendKeys("praveen.nayak222@gmail.com");
        driver.findElement(By.id("YourEmailAddress")).clear();
        driver.findElement(By.id("YourEmailAddress")).sendKeys("praveen222nayak@gmail.com");
        driver.findElement(By.name("send-email")).click();
        //Thread.sleep(2000);
        
        boolean res = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent')]")).isDisplayed();
        if(res)
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
        driver.findElement(By.linkText("Log out")).click();
    	driver.close();
	}

}
