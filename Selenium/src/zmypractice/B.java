package zmypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Retiring Room']/../../../li[4]/a")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//driver.navigate().back();
	}
	
}
