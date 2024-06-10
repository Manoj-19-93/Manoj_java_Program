package Assignments_Practice_Mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_162 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		
		for(WebElement link : links)
		{
			String url =link.getAttribute("href");
			String urlText =link.getText();
			System.out.println(urlText);
			System.out.println(url);
		}
	}

	
}
