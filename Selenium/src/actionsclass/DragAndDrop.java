package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	        
	        Actions action=new Actions(driver);
	        
	        
	        WebElement rome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	        WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
	        action.dragAndDrop(rome, italy).perform();
	        
	        WebElement madrid = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	        WebElement spain = driver.findElement(By.xpath("//div[text()='Spain']"));
	        action.dragAndDrop(madrid, spain).perform();
	        
	        WebElement oslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
	        WebElement norway = driver.findElement(By.xpath("//div[text()='Norway']"));
	        action.dragAndDrop(oslo,norway).perform();
	        
	        WebElement copenhagen = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	        WebElement denmark = driver.findElement(By.xpath("//div[text()='Denmark']"));
	        action.dragAndDrop(copenhagen,denmark).perform();
	        
	        WebElement seoul = driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	        WebElement southkorea = driver.findElement(By.xpath("//div[text()='South Korea']"));
	        action.dragAndDrop(seoul,southkorea).perform();
	        
	        WebElement stockholm = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
	        WebElement  sweden= driver.findElement(By.xpath("//div[text()='Sweden']"));
	        action.dragAndDrop(stockholm,sweden).perform();
	        
	        WebElement washington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	        WebElement us= driver.findElement(By.xpath("//div[text()='United States']"));
	        action.dragAndDrop(washington,us).perform();
	        
	        driver.quit();

	}

}
