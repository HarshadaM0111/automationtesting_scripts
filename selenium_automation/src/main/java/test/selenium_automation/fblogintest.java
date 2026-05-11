package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// fb login page =  email textbox
		driver.findElement(By.id("_R_oiqjbjb9pb6amH1_")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("_R_oqqjbjb9pb6amH1_")).sendKeys("admin");
		
	
		driver.close();
	}

}
