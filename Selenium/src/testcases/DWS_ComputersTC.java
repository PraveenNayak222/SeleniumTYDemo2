package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_ComputersTC extends Base_Test {
	@Test
	public void mouseHover()
	{
		Actions a=new Actions(driver);
		
		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		a.moveToElement(comp).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Desktop')]")).click();
		
	}

}
