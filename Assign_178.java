package Assignments_Practice_Mkt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_178 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement accountandlist=driver.findElement(By.id("nav-link-accountList"));
		Actions a1 =new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement signin = driver.findElement(By.className("nav-action-inner"));
		signin.click(); 
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_GroTech\\ExcelFiles\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String username=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		WebElement entermail = driver.findElement(By.id("ap_email"));
		entermail.sendKeys(username); 
		
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click(); 
		
		
	}

}

