package Assignments_Practice_Mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_151 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("shoe");
		Thread.sleep(2000);
		
		List<WebElement> autosugesstion =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count =autosugesstion.size();
		System.out.println(count);
		autosugesstion.get(4).click();
	}

}
