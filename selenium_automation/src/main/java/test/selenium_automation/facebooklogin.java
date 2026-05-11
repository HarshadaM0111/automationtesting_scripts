package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		
		driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_")).sendKeys("Ruta");
		
		driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_")).sendKeys("rane");
		
		driver.findElement(By.id("_R_6ad8p4jikacppb6amH1_")).sendKeys("6754328912");
		
		driver.findElement(By.id("_R_clap4jikacppb6amH1_")).sendKeys("rane123");
		
	}

}
