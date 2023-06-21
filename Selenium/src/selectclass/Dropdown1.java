package selectclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/demo.html");
		
		WebElement cars = driver.findElement(By.id("standard_cars"));
		
		Select s=new Select(cars);
		
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("jgr");
		Thread.sleep(1000);
		s.selectByVisibleText("Audi");
		Thread.sleep(1000);
		
		
		driver.close();
	}

}
