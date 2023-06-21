/*
 Check if a particular item is present in the SortBy listbox. If it is present, then print 
 the index at which the item is located.
 */
package selectclass;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign4 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement sortByLB = driver.findElement(By.id("products-orderby"));
		
		Select s=new Select(sortByLB);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Enter the item to search");
		String item=sc.nextLine();
		
		for (int i=0;i<options.size();i++) {
			String text = options.get(i).getText();
			if(text.equalsIgnoreCase(item))
			{
				System.out.println("Index of the item is :"+i);
			}
		} 
		
		driver.quit();
	}
}
