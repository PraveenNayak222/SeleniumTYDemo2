package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Selenium/WebPages/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Praveen");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Nayak");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TY");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bengaluru");
		
		driver.quit();
		

	}

}
