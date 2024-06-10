package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_145 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		WebElement e2 = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']"));
		e2.click();
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		e3.sendKeys("123456789");
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='continue']"));
		e4.click();
	}

}