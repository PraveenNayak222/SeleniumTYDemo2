package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpWebEleMethods {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com");
	
	String text1 = driver.findElement(By.linkText("Register")).getText();
	System.out.println(text1);
	
	String text2 = driver.findElement(By.id("small-searchterms")).getText();
	System.out.println(text2);
	
	String text3 = driver.findElement(By.id("small-searchterms")).getAttribute("id");
	System.out.println(text3);
	
	String text4 = driver.findElement(By.id("small-searchterms")).getAttribute("value");
	System.out.println(text4);
	
	driver.findElement(By.id("small-searchterms")).sendKeys("Praveen");
	String text5 = driver.findElement(By.id("small-searchterms")).getAttribute("value");
	System.out.println(text5);
	
	String text6 = driver.findElement(By.id("small-searchterms")).getCssValue("writing-mode");
	System.out.println(text6);
	
	String text7 = driver.findElement(By.id("small-searchterms")).getCssValue("cursor");
	System.out.println(text7);
	
	String text8 = driver.findElement(By.linkText("Register")).getCssValue("color");
	System.out.println(text8);
	
	driver.quit();
	
}
}
