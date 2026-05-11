package OtherWebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotHandling {

	static ChromeDriver driver;
	
	void launch() {
		
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
