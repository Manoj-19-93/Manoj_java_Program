package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_161 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement loginButton = driver.findElement(By.className("login_button"));
		loginButton.click();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Abc");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abc@123");
		
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("Abc@123");
	}
}
