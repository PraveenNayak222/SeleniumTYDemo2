package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Typing {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		
		action.moveToElement(searchbox).click().perform();
		
		action.sendKeys("mobiles");
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@value='Search']"));
		
		action.moveToElement(searchbutton).click().perform();
		
		Thread.sleep(2000);
		
	     action.sendKeys(Keys.PAGE_DOWN).perform();
	     action.sendKeys(Keys.PAGE_UP).perform();
	     
	     driver.quit();

	}
}
//These actions can be performed directly but in this example we have seen how to use Actions
//class for the same.
