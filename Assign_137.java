package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_137 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
		WebElement e1 =driver.findElement(By.id("Choice1"));
		Select dropdown1 = new Select(e1);
		dropdown1.selectByVisibleText("Demo2");
		Thread.sleep(2000);
		
		WebElement e2 =driver.findElement(By.id("Choice9"));
		Select dropdown2 = new Select(e2);
		dropdown2.selectByValue("SQL15");
		Thread.sleep(2000); 
		
		WebElement e3 =driver.findElement(By.id("Choice6"));
		Select dropdown3 = new Select(e3);
		dropdown3.selectByValue("Night10");
		Thread.sleep(2000);
		
		WebElement e4 =driver.findElement(By.id("Choice8"));
		Select dropdown4 = new Select(e4);
		dropdown4.selectByVisibleText("QTP10");                            
		Thread.sleep(2000);
		
		WebElement e5 =driver.findElement(By.id("Choice4"));
		Select dropdown5 = new Select(e5);
		dropdown5.selectByVisibleText("Energy15");
		Thread.sleep(2000);
		
		WebElement e6 =driver.findElement(By.id("Choice8"));
		Select dropdown6 = new Select(e6);
		dropdown6.selectByVisibleText("QTP9");                            
		Thread.sleep(2000);
		
		WebElement e7 =driver.findElement(By.id("Choice4"));
		Select dropdown7 = new Select(e7);
		dropdown7.selectByVisibleText("Energy14");
		Thread.sleep(2000);
		
		WebElement e8 =driver.findElement(By.id("Choice8"));
		Select dropdown8 = new Select(e8);
		dropdown8.selectByValue("QTP8");
		Thread.sleep(2000);
		
		WebElement e9 =driver.findElement(By.id("Choice4"));
		Select dropdown9 = new Select(e9);
		dropdown9.selectByVisibleText("Energy13");
		Thread.sleep(2000);

		
	}

}
