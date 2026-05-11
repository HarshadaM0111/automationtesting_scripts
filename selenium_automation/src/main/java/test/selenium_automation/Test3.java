package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//1.ID = done
		driver.findElement(By.id("username")).sendKeys("student");
		
		//2. Name = done
		 driver.findElement(By.name("password")).sendKeys("Password123");
		
		// 3. classname(finding the submit button) = done
		driver.findElement(By.className("btn")).click();

		// 4. tagname = done 
//		driver.findElement(By.tagName("input")).sendKeys("student");
		
		// 5.linktext = done
//		driver.findElement(By.linkText("COURSES")).click();
		
		// 6.PARTIALLINKTEXT = done
//		driver.findElement(By.partialLinkText("BL")).click();
		
		// 7. xPath(//tagnmae[@attribute='value'])=done
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		
		//8. cssselector(tagname[attribute='value'])=done
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password123");
		
		// 3. classname(finding the submit button) = done
		driver.findElement(By.className("btn")).click();

	}

}
