package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath_Assign_132 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/learningHTML1.html");
		WebElement un=driver.findElement(By.xpath("(//input)[@id='1']"));
		un.sendKeys("Manoj");
		WebElement hint=driver.findElement(By.xpath("(//input)[@id='2']"));
		hint.sendKeys("Manoj");
		WebElement pass=driver.findElement(By.xpath("(//input)[@id='3']"));
		pass.sendKeys("pass");
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("firstname");
		WebElement gender=driver.findElement(By.xpath("(//input)[@type='radio']"));
		gender.click();
		WebElement place=driver.findElement(By.xpath("(/html/body/input)[6]"));
		place.click();
		WebElement signup=driver.findElement(By.xpath("(//input)[@type='button']"));
		signup.click();

	}

}
