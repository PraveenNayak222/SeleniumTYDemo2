package testng_basics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestDataProviderExcel {
	@DataProvider(name = "LoginData")
	public String[][] loginDataProvider() throws EncryptedDocumentException, IOException {
	  String[][]data = LearningReadExcel.fetchDataIntoArray("Login");
	  return data;
	}
	@Test(dataProvider = "LoginData")
	public void loginTest(String username,String password) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.close();
	}

}
