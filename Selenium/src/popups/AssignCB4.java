package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignCB4 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/MultipleWindow.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		
		Set<String> child_windows = driver.getWindowHandles();
		
		for(String child_window:child_windows)
		{  
		driver.switchTo().window(child_window);
		String title=driver.getTitle();
		if(title.contains("Olive Garden Italian Restaurant"))
		{
			driver.close();
		}
	}
}
}