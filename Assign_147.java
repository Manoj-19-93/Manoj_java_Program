package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_147 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/learningHTML1.html");
		WebElement un=driver.findElement(By.id("123"));
		boolean b1=un.isSelected();
		
		if(b1==true)
		{
		   System.out.println("its' selected");
		}
		else
		{
			System.out.println("its not selected");
			un.click();
			System.out.println("I have selected it now");
		}
	}

}
