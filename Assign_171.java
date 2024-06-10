package Assignments_Practice_Mkt;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign_171 {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
        Date date = new Date();
		Date CurrentDate = new Date(date.getTime());
		String dateinstring =CurrentDate.toString().replace(":", "_");
		System.out.println("Current Date :" + dateinstring );
		
		TakesScreenshot a1  = driver;
		File source = a1.getScreenshotAs(OutputType.FILE);
		Assign_170 classname = new Assign_170();
		String name = classname.getClass().toString();
		System.out.println( name );
		File destination = new File("C:\\Users\\MANOJ1\\Pictures\\"+name+".png");
		FileHandler.copy(source, destination);
	}

}