/*
 Click on all radio buttons one by one
*/
package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
	    List<WebElement> book_list = driver.findElements(By.xpath("//label[contains(@for,'pollanswers')]"));
		//Printing first radio button text
	    WebElement firstRb = driver.findElement(By.xpath("(//label[contains(@for,'pollanswers')])[1]"));
	    //Printing last radio button text
	    WebElement lastRb = driver.findElement(By.xpath("(//label[contains(@for,'pollanswers')])[last()]"));
		
		System.out.println(firstRb.getText());
		System.out.println(lastRb.getText());
		for(int i=0;i<book_list.size();i++)
	   {
			 System.out.println(book_list.get(i).getText());
	       book_list.get(i).click();
	       Thread.sleep(2000);
	   }
	   driver.quit();
	}

}
