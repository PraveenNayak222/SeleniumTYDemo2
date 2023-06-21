package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions2{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.myntra.com/");
        
        driver.findElement(By.className("desktop-searchBar")).sendKeys("Puma");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li[text()='Puma Men']")).click();
        
	}

}
