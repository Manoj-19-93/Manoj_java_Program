package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_166 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btnjs']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
