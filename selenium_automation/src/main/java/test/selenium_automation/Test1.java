package test.selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//use to maximize the window 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.fortunecloudindia.com/");
		
		driver.navigate().back();
		
		driver.close();
	}

}
