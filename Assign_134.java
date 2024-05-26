package Assignments_Practice_Mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_134 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email=driver.findElement(By.xpath("(//input)[@id='ap_email']"));
		email.sendKeys("xyz@gmail.com");
		WebElement Continue_button=driver.findElement(By.xpath("(//input)[@id='continue']"));
		Continue_button.click();
		WebElement password=driver.findElement(By.xpath("(//input)[@id='ap_password']"));
		password.sendKeys("pass");
		WebElement signup=driver.findElement(By.xpath("(//input)[@id='signInSubmit']"));
		signup.click();


	}

}
