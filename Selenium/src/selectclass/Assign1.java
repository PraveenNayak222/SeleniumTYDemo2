/*
 Log on to DemoWebshop site,click on Books and select a value in SortBy,Display and ViewAs.
 */
package selectclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		WebElement sortByLB = driver.findElement(By.id("products-orderby"));
		Select s1=new Select(sortByLB);
		s1.selectByVisibleText("Name: A to Z");
		
		WebElement displayLB = driver.findElement(By.id("products-pagesize"));
		Select s2=new Select(displayLB);
		s2.selectByIndex(0);
		
		
		WebElement viewAsLB = driver.findElement(By.id("products-viewmode"));
		Select s3=new Select(viewAsLB);
		s3.selectByVisibleText("List");
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
