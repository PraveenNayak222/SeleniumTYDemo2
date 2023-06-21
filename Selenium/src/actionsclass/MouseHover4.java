package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Actions action=new Actions(driver);
		
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		action.moveToElement(jobs).build().perform();
		
		WebElement jobsBySkill = driver.findElement(By.xpath("//div[text()='Jobs by skill']"));
		
		action.moveToElement(jobsBySkill).click().perform();
		
		driver.quit();
		
	}

}
