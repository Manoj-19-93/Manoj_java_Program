package Assignments_Practice_Mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_148_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement element= driver.findElement(By.name("q"));
		if(element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys("india");
			Thread.sleep(2000);
		}
		List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count =autosuggestion.size();
		System.out.println(count);
		autosuggestion.get(4).click();
	}

}
