package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_BooksTC extends Base_Test{
	@Test
	public void books()
	{	
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
	}

}
