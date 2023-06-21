package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Upcasting to the highest possible level( we can achieve RTP)
		WebDriver driver=new ChromeDriver();
		
		//Maximizing the browser
		driver.manage().window().maximize();
		
		//navigation methods
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(2000);
		driver.navigate().to("https://javatpoint.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();

	}

}
