//Select the items in the SortBy listbox one by one using index.
package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	WebElement sortByLB = driver.findElement(By.id("products-orderby"));
	
	Select s=new Select(sortByLB);
	List<WebElement> options = s.getOptions();
	for(int i=0;i<options.size();i++) {
		s.selectByIndex(i); 
		//Refinding the element because of StaleElementReferenceException
		sortByLB = driver.findElement(By.id("products-orderby"));
		s=new Select(sortByLB);	
	}
	}
}
