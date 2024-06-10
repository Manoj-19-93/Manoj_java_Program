package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_167_uploadFIle {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement choosefile = driver.findElement(By.id("file"));
		choosefile.sendKeys("C:\\Users\\HP\\Downloads\\तृतीय पाठ_10th.pdf");
	}

}
