package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_SearchTC extends Base_Test{
	@DataProvider(name="Search")
	public Object[][] searchItem()
	{
		Object[][]data=new Object[3][1];
		data[0][0]="Mobiles";
		data[1][0]="Computers";
		data[2][0]="Books";
		return data;
	}
	@Test(dataProvider="Search")
	public void search(String search)
	{
			driver.findElement(By.id("small-searchterms")).sendKeys(search);
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
