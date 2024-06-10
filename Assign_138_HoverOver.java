package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_138_HoverOver {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement accountandlist= driver.findElement(By.xpath(null));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		
		WebElement signin = driver.findElement(By.xpath(null));
		signin.click();  
	}

}
