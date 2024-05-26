package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_127 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.name("firstname")).sendKeys("xyz");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_email__")).sendKeys("12345467890");
		driver.findElement(By.id("password_step_input")).sendKeys("pass");
		driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		//driver.findElement(By.xpath("(//*[@id=\"u_0_s_QS\"])")).click();
		
	}

}
