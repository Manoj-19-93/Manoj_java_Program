package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_146 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement element= driver.findElement(By.name("q"));
		if(element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys("india");
		}
	}

}
