package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        Actions action=new Actions(driver);
        
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
        
        action.contextClick(button).perform();
        
        WebElement copy = driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
        
        action.moveToElement(copy).perform();
        
        driver.quit();

	}

}
