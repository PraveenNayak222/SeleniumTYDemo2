package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			driver.manage().window().maximize();
			
			WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));

			Actions action=new Actions(driver);
			
			action.doubleClick(button).perform();
			
			Alert ale=driver.switchTo().alert();
			
			Thread.sleep(2000);
			
			ale.accept();
			
			driver.close();
	}

}
