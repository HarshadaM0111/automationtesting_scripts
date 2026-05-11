package OtherWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class other2 extends otherWebelement{


void laptoplinks() {
		driver.findElement(By.id("apple")).click();
		driver.navigate().back();
		
		driver.findElement(By.id("lenovo")).click();
		driver.navigate().back();
		
		driver.findElement(By.id("dell")).click();
		driver.navigate().back();
		
	}
	void brokenlinks() throws InterruptedException {
	
		
		List<WebElement> bl = driver.findElements(By.partialLinkText("Errorcode"));
		System.out.println("Size of WebElement list is :" +bl.size());
		for(int i=0; i<bl.size();i++) {
			System.out.println(bl.get(i));
			bl.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		
		
		
	}
	
}
