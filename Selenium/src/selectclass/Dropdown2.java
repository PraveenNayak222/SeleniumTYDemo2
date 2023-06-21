package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/demo.html");
		
		WebElement cars = driver.findElement(By.id("standard_cars"));
		
		Select s=new Select(cars);
		
		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		
		for (WebElement option: options) {
			
			System.out.println(option.getText());
			
		}
		
		driver.quit();
		

	}

}
