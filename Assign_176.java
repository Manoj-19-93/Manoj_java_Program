package Assignments_Practice_Mkt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assign_176 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_GroTech\\ExcelFiles\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String v1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(v1);
		
	}

}

