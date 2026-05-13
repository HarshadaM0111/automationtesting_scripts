package OtherWebElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotHandling {

	static ChromeDriver driver;
	
	static void myntralunch() {
		
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
	}
	
	static void fullss() throws IOException {

		//Type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// Tempory screenshot
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		// Permenent screenshot
		// File dest = new File(""C:\Users\Harshada Mane\Desktop\myntra.jpeg.txt"");
		File dest = new File("C:\\Users\\Harshada Mane\\automation_testing\\selenium_automation\\selenium_automation\\mytnrass.png");
		// copy temp file into perment location 
		
		FileHandler.copy(src, dest);
		
		System.out.println("screenshot captured!!");
	}
	void myntralogo() {
		// partial screenshot
		
		driver.get("");
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 

		myntralunch();
		fullss();
		

	}

	
}
