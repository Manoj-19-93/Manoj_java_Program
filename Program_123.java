package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_123 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		WebElement element=driver.findElement(By.xpath("(/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1])"));
		element.click();
	}

}
