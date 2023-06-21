package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][]data=new Object[2][5];
		//First iteration
		data[0][0]="Praveen";
		data[0][1]="Nayak";
		data[0][2]="abc@test.com";
		data[0][3]="abc123";
		data[0][4]="abc123";
		
		//Second iteration
		data[1][0]="Pramodh";
		data[1][1]="Nayak";
		data[1][2]="xyz@test.com";
		data[1][3]="1234";
		data[1][4]="1234";	
		
		return data;
	}
	
	@Test(dataProvider = "TestData") //Testcase for Register
	public void dataDemo(String FirstName,String LastName,String Email,String Password,String Cpassword)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Cpassword);
		driver.close();
	}

}
