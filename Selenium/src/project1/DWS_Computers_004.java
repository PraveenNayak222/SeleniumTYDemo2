package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Computers_004 {

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
        
        driver.findElement(By.id("products-orderby")).click();
        driver.findElement(By.xpath("//option[text()='Name: A to Z']")).click();
        
        List<WebElement> computers = driver.findElements(By.xpath("//div[@class='product-grid']/div//a[contains(text(),'o')]"));
       
       for(WebElement comp:computers)
       {
    	   System.out.println(comp.getText());
       }
       driver.findElement(By.linkText("Log out")).click();
    	driver.close();
	}

}
