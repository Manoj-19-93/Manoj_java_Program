package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
        WebElement gmail =driver.findElement(By.linkText("Gmail"));
        gmail.click();
	}

}
