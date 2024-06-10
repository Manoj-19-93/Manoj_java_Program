package Assignments_Practice_Mkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_180_DriverMethods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registeration-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
