package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		//Making chromedriver.exe file to run
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//instantiating ChromeBrowser or Opening chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Entering URL
		driver.get("http://www.google.co.in");
		
		
		
	}

}
