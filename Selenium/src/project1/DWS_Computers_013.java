package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import synchronisation.DemoFluentWait;

public class DWS_Computers_013 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("praveen222nayak@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		
		driver.findElement(By.xpath("((//a[contains(text(),'Desktops')]))[4]")).click();
        //Thread.sleep(3000);
        
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]"))));
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]")).click();
        //Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        //Thread.sleep(2000);
       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@class='qty-input valid']"))));
        
       // driver.findElement(By.xpath("//input[@class='qty-input valid']")).sendKeys("2");
        driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Simple Computer'])[2]/../..//input[@type='checkbox']")).click();
	    
		 WebElement countryLB = driver.findElement(By.id("CountryId"));
			
		Select s1=new Select(countryLB);
			
		s1.selectByVisibleText("India");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("termsofservice")).click();
		
		WebElement addressLB = driver.findElement(By.id("billing-address-select"));
		
		Select s2=new Select(addressLB);
		s2.selectByVisibleText("New Address");
		
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		
		Select s3=new Select(country);
		
		s3.selectByVisibleText("India");
		
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Kathriguppe");
		driver.findElement(By.id("BillingNewAddress.ZipPostalCode")).sendKeys("560065");
		driver.findElement(By.id("BillingNewAddress.PhoneNumber")).sendKeys("98784663");
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("PickUpInStore")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Cash On')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		boolean res = driver.findElement(By.xpath("//strong[text(),'Your order has been successfully processed!']")).isDisplayed();
		if(res)
		{
		  System.out.println("Pass");	
		}
		else
		{
			 System.out.println("Fail");	
		}
		driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
}
