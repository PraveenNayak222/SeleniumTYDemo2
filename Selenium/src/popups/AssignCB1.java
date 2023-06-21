package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignCB1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
	
		Set<String> child_windows = driver.getWindowHandles();
			
		for(String child_window:child_windows)
		{
			driver.switchTo().window(child_window);
			if(driver.getTitle().contains("Facebook"))
			{
				driver.close();
			}
				
		}
	}

}
