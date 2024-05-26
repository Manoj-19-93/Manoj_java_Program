package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_125 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.xpath("(/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1])")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		
	}

}
