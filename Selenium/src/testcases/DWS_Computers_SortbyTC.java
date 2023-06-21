package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_Computers_SortbyTC extends Base_Test {	
	@DataProvider(name="Computers_SortBy")
	public Object[][] compSort()
	{
		Object[][]data=new Object[2][1];
		data[0][0]="Name: Z to A";
		
		data[1][0]="Position";
		return data;
	}
	
	@Test(dataProvider ="Computers_SortBy")
	public void mouseHover(String sort)
	{
		Actions a=new Actions(driver);
		
		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		a.moveToElement(comp).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Desktop')]")).click();
		
		WebElement sortByLB = driver.findElement(By.id("products-orderby"));
		
		Select s=new Select(sortByLB);
		
		s.selectByVisibleText(sort);
		
	}
    
}
