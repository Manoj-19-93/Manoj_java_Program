package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_139 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement d1 = driver.findElement(By.xpath("(//div[@class='popup4'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(d1).perform();
		d1.click();
		
		WebElement d4 = driver.findElement(By.xpath("(//div[@class='popup6'])[1]"));
		Actions a4 = new Actions(driver);
		a4.moveToElement(d4).perform();
		d4.click();
		
		
		WebElement d5 =driver.findElement(By.xpath("(//div[@class='popup7'])[1]"));
		Actions a5= new Actions(driver);
		a5.moveToElement(d5).perform();
		d5.click();
		
		WebElement d2 =driver.findElement(By.xpath("(//div[@class='popup4'])[1]"));
		Actions a2= new Actions(driver);
		a2.moveToElement(d2).perform();
		d2.click();
		
		
		WebElement d6 = driver.findElement(By.xpath("(//div[@class='popup8'])[1]"));
		Actions a6= new Actions(driver);
		a6.moveToElement(d6).perform();
		d6.click();
		
		
		WebElement d7 =driver.findElement(By.xpath("(//div[@class='popup9'])[1]"));
		Actions a7 = new Actions(driver);
		a7.moveToElement(d7).perform();
		d7.click();
	}

}