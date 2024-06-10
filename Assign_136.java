package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_136 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement e1 =driver.findElement(By.id("day"));
		Select dropdown = new Select(e1);
		dropdown.selectByIndex(28);
		Thread.sleep(2000);
		
		WebElement e2 =driver.findElement(By.id("month"));
		Select dropdown1 = new Select(e2);
		dropdown1.selectByValue("6");
		Thread.sleep(2000);

		
		WebElement e3 =driver.findElement(By.id("year"));
		Select dropdown3 = new Select(e3);
		dropdown1.selectByVisibleText("2024");
		Thread.sleep(2000);

	}

}
