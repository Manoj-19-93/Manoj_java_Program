package Assignments_Practice_Mkt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_163 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjw9vqyBhCKARIsAIIcLMH53t3wAwf8zJmRDtSoEAKENbCB4LpkXqx7uEIgc-ZfVHyBVuXGb-QaAhLUEALw_wcB&gclsrc=aw.ds");
		
		WebElement loginwithgoogle = driver.findElement(By.xpath("//span[.='Google']"));
		loginwithgoogle.click();
		
		Set<String> s1 =driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid=s1.iterator();
		String p_id = pcid.next();
		String c_id = pcid.next();
		System.out.println(p_id);
		System.out.println(p_id);
		
		driver.switchTo().window(c_id);
	}

}
