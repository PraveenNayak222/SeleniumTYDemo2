package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/delete_customer.php ");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.name("cusid")).sendKeys("2145");
			
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(2000);
			
			String alerttext = driver.switchTo().alert().getText();
			
			System.out.println(alerttext);
			
			driver.switchTo().alert().dismiss();
			
			driver.close();
	}
		

}
