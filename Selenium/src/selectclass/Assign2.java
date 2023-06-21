/*
 Print the text of all the items present in the SortBy listBox.
 */
package selectclass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
			WebElement sortByLB = driver.findElement(By.id("products-orderby"));
			
			Select s=new Select(sortByLB);
			List<WebElement> options = s.getOptions();
			
			for (WebElement option : options) {
				System.out.println(option.getText());
			}
			driver.quit();
	}

}
