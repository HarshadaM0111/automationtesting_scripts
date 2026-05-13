package OtherWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	
ChromeDriver driver;

void framelunach() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	//driver.get("https://demo.automationtesting.in/Frames.html");
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	// Single Iframe 
	
	
	// it is used to switch webdriver to iframe
	// i. index
	// driver.switchTo().frame(0);
	 
	// driver.findElement(By.cssSelector("input[type='text']")).sendKeys("harshada");
	 
	 //2. name
//	 driver.switchTo().frame("SingleFrame");
//	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("harshada");
	 //driver.findElement(By.xpath("//input[@type()='text']")).sendKeys("Harshada");
	 
	 //3 . Id 
//	 driver.switchTo().frame("SingleFrame");
//	 driver.findElement(By.tagName("input")).sendKeys("Harshda");
	
	
	 //4. webelement
//	 WebElement s_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//	 driver.switchTo().frame(s_frame);
//	 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("harshada");
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harshada");
	
}
void multipleiframe() throws InterruptedException {
	
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	
	
	WebElement outerframe =  driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
	driver.switchTo().frame(outerframe);
	

	WebElement innerframe =  driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	
	//driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harshada");
	
	Thread.sleep(3000);
	
	driver.quit();


}

void newWindow() {
	// it is used to open the new wiindow
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.flipkart.com/");
}
void newtab() {
	// it is used to open the new tab on same window
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.in/");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FrameDemo fl = new FrameDemo();
		fl.framelunach();
		fl.multipleiframe();
		fl.newWindow();
		
		fl.newtab();
		
	}

}
