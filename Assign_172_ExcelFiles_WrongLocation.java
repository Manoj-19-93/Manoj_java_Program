package Assignments_Practice_Mkt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assign_172_ExcelFiles_WrongLocation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream("D:\\Users\\HP\\eclipse-workspace\\Selenium_GroTech\\ExcelFiles\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("Sheet1");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String value1 =c1.getStringCellValue();
		System.out.println(value1);
	}

}
