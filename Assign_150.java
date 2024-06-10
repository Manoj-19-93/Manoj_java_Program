package Assignments_Practice_Mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_150 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=pharmeasy&oq=pharmea&gs_lcrp=EgZjaHJvbWUqEAgAEAAYgwEY4wIYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyEwgBEC4YgwEYxwEYsQMY0QMYgAQyBggCEEUYOTIHCAMQABiABDIHCAQQABiABDIKCAUQABixAxiABDIHCAYQABiABDIGCAcQBRhAqAIAsAIA&sourceid=chrome&ie=UTF-8https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=GSB_New_CX_FP&utm_adgroup=OTC_Healthcare&gad_source=1&gclid=EAIaIQobChMIxbDf8fm5hgMV5atmAh3rly5aEAAYASAAEgJNi_D_BwE");
		
		WebElement element = driver.findElement(By.cssSelector("[class='Input_input__AFI4RTypeahead_input__64Wro']"));
		element.sendKeys("Diclo");
		Thread.sleep(2000);
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("(//div[@class='Typeahead_results__y95O9 MedicineSearch_results__vsEUo MedicineSearch_results--withButton__dXPWq'])/div"));
		int count =autosuggestion.size();
		autosuggestion.get(4).click();

	}

}
