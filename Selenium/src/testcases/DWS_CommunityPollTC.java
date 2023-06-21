package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_CommunityPollTC extends Base_Test {
	@Test
	public void vote()
	{
			driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		
	}

}
