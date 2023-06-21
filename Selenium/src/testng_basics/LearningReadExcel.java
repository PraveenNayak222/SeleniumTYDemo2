package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    // singleRead();	
    // multipleRead("Login");
    // fetchDataIntoArray("Login");
     numericRead("Login",1, 1);
	}
	public static void singleRead() throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Login");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		
		System.out.println(cell.toString());	
	}
	public static void multipleRead(String sheetName) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
	    }
		
	}
	public static String[][] fetchDataIntoArray(String sheetName) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet(sheetName);
		 
		int row=sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		String[][]data=new String[row-1][col];
	
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();				
			}
		}
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(data[i][j]+"       ");
			}
			System.out.println();
		}	
		return data;
	}
	public static double numericRead(String sheetName,int row,int col) throws EncryptedDocumentException, IOException {
		
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		double value = sheet.getRow(row).getCell(col).getNumericCellValue();
		System.out.println(value);
		return value;
		
	}
}
