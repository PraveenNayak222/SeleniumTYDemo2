package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Computers_009 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
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
        String title = driver.getTitle();
        
        if(title.contains("Email a friend"))
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
