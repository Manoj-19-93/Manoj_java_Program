package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_124 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}

}