package Assignments_Practice_Mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_152 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement element =driver.findElement(By.name("q"));
		if(element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys("shoe");
			Thread.sleep(2000);
		}
		
		List<WebElement> list1 =driver.findElements(By.xpath("//div[@class='kRd8Cs']/form/ul/li"));
		int count =list1.size();
		System.out.println(count);
		list1.get(4).click();
	}

}
