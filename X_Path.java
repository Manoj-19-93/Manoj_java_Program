package Assignments_Practice_Mkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Desktop/learningHTML1.html");
	}

}
