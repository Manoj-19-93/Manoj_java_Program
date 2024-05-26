package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_133 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoes for man");
		WebElement searchbutton =driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		WebElement Shoe =driver.findElement(By.xpath("(//img)[@class='s-image s-image-optimized-rendering']"));
		Shoe.click();
	}

}
