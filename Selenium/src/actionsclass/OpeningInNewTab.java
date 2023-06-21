package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningInNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Actions ac=new Actions(driver);
		WebElement regLink = driver.findElement(By.linkText("Register"));
		
		ac.contextClick(regLink).sendKeys("T").perform();
		ac.sendKeys("t").perform();
		
	}

}
