/*
display count of links in demowebshop page
*/
package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total links :"+links.size());
		for(int i=0;i<links.size();i++)
		{
			String text=links.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();
		
	}
}