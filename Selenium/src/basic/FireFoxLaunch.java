package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		//Making chromedriver.exe file to run
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		//instantiating FireFox or Opening FireFox browser
		FirefoxDriver driver=new FirefoxDriver();
		
		//Entering URL
		driver.get("https://www.google.co.in");

	}

}
