package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_Books_DisplayTC extends Base_Test{
	
	@DataProvider(name="Books_Display")
	public Object[][] booksDis()
	{
		Object[][]data=new Object[3][1];
		data[0][0]="4";
		
		data[1][0]="8";
		
		data[2][0]="12";
		return data;
	}
	
	@Test(dataProvider = "Books_Display")
	public void books(String dispSize)
	{	
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		WebElement dispLB = driver.findElement(By.id("products-pagesize"));
		
		Select s=new Select(dispLB);
		
		s.selectByVisibleText(dispSize);
		
	}

}
