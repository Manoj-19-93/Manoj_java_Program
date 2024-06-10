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

public class Assign_168_ScreenShot {

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
		//String dateinstringwithunderscore =dateinstring.to
		System.out.println("Current Date :" + dateinstring );
		
		TakesScreenshot a1  = driver;
		File source = a1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\MANOJ\\Pictures\\TestPhoto".concat(dateinstring) + ".png");
		//File destination = new File("C:\\Users\\MANOJ\\Pictures\\TestPhoto"+Math.random()+".png");
		FileHandler.copy(source, destination);
	}

}
