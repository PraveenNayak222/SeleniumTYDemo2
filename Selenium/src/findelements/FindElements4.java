/*
Enter values in all fields of "Multiple Elements with same "name" property"
section.
*/
package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user1/Downloads/demo.html");
		
		List<WebElement>fields= driver.findElements(By.xpath("//input[@name='fname']"));
		
		for(int i=0;i<fields.size();i++)
		{
			fields.get(i).sendKeys("Praveen");
		}
		driver.quit();
		
	}
}