package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_SubscribeTC extends Base_Test{
	
	@DataProvider(name="Subscribe")
	public Object[][] subscribeData()
	{
		Object[][]data=new Object[2][1];
		data[0][0]="abcd@gmail.com";
		data[1][0]="xyz@gmail.com";
		return data;
		
	}
	@Test(dataProvider = "Subscribe")
	public void subscribe(String mail)
	{
			driver.findElement(By.id("newsletter-email")).sendKeys(mail);
			driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
