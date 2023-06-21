package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/MultipleWindow.html");
		
		driver.manage().window().maximize();
		
		//Identifying parent window
		String parent_window = driver.getWindowHandle();
	    System.out.println(parent_window);
	    
	    //clicking on open food site
	    driver.findElement(By.xpath("//input[@type='button']")).click();
	    Thread.sleep(2000);
	    
	    //Identifying child windows
	    Set<String> child_windows = driver.getWindowHandles();
	    System.out.println(child_windows);
	    
	    //switching to child windows and closing one by one
	    for(String child_window:child_windows)
	    {
	    	driver.switchTo().window(child_window);
	    	driver.close();
	    	Thread.sleep(1000);
	    }

	}

}
