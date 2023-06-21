package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        Actions action=new Actions(driver);
        
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

        action.doubleClick(button).perform();
        
        driver.quit();
	}

}
