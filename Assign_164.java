package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_164 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoe");
		searchbox.sendKeys(Keys.ENTER);
		
		WebElement shoe = driver.findElement(By.xpath("//div[@data-component-id='18']"));
		shoe.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addtocart.click();
		
	}

}