package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_140 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		
		WebElement e1 = driver.findElement(By.xpath("(//a)[@class='gb_I'][1]"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
	}

}