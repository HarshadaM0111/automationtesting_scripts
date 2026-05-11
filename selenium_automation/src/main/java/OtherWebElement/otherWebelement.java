package OtherWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class otherWebelement {

	
	ChromeDriver driver;
	
	
	void launch() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
	}
	void uplaodfile() throws InterruptedException {
		
		//Single File upload 
		
		WebElement file = driver.findElement(By.id("singleFileInput"));
		file.sendKeys("C:\\Users\\Harshada Mane\\Downloads\\Harshada Mane (5).pdf");
		WebElement uploadbtn = driver.findElement(By.xpath("//button[text()='Upload Single File']"));
		uploadbtn.click();
		
		Thread.sleep(2000);
		// multiple file upload 
//		
//		WebElement secondfile = driver.findElement(By.id("multipleFilesInput"));
//		secondfile.sendKeys("C:\\Users\\Harshada Mane\\Downloads\\Harshada Mane (5).pdf\n"+"\"C:\\Users\\Harshada Mane\\Downloads\\Fortune Cloud Placement Policy.pdf\"");
//		WebElement uploadmultibtn = driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
//		uploadmultibtn.click();
		
		
		
		
	}
	

}
