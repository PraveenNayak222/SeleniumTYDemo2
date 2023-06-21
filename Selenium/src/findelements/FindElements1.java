/*
 Display text of all Books WebElement
 */
package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {


	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	List<WebElement> book_list = driver.findElements(By.xpath("//a[contains(text(),'Books')]"));
	
	System.out.println(book_list.size());
	
	for(int i=0;i<book_list.size();i++)
	{
		String value=book_list.get(i).getText();
		System.out.println(value);
	}
    driver.quit();
	}
}
