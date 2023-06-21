package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]"));

		Actions action=new Actions(driver);
		
		action.moveToElement(computer).build().perform();
		
		WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"));
		
		//Here we are calling click() of Actions class(Not WebElement method)
		//build() will be internally called by perform()
		action.moveToElement(desktop).click().perform();
		
		driver.quit();
		
		
	}

}
