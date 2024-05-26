package Assignments_Practice_Mkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_title_122 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();                             
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
