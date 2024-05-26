package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_126 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234546");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
	}

}
