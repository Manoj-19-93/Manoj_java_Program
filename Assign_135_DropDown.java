package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_135_DropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		
		Select dropdown = new Select(e1);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		dropdown.selectByValue("search-alias=nowstore");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Appliances");
		Thread.sleep(2000);
	}

}
