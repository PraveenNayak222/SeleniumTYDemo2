package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]"));

		Actions action=new Actions(driver);
		
		action.moveToElement(computer).build().perform();
		
		WebElement accessories = driver.findElement(By.xpath("(//a[contains(text(),'Access')])[1]"));
	    
		action.moveToElement(accessories).click().perform();
		
		driver.quit();
	}

}
