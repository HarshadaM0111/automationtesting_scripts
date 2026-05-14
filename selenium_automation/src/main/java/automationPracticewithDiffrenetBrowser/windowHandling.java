package automationPracticewithDiffrenetBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		
		System.out.println(" Parent Window - "+parentHandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Reva");
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("patil");
		Thread.sleep(2000);
	//	driver.quit();
		
	}

}
