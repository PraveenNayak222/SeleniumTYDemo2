package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover3 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electro')])[1]"));
        
		action.moveToElement(electronics).build().perform();
		
		WebElement cell = driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"));
		
		action.moveToElement(cell).click().perform();
		
		driver.quit();
		
	}

}
