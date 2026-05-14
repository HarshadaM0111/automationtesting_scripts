package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Testing_practice {

	Actions act;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Harshada");
		
		driver.findElement(By.id("email")).sendKeys("hmane123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("3452675413");
		
		driver.findElement(By.id("textarea")).sendKeys("Omerga");
		
		driver.findElement(By.xpath("//input[@value='female']")).click();
	
		
		driver.findElement(By.id("sunday")).click();
		
	Select sel1 = new Select(driver.findElement(By.id("country")));
		
		sel1.selectByIndex(5);
		
		

		Select sel2 = new Select(driver.findElement(By.id("colors")));
		sel2.selectByIndex(2);
		
		Select sel3 = new Select(driver.findElement(By.id("animals")));
		sel3.selectByIndex(6);
		
		driver.findElement(By.id("datepicker")).sendKeys("31/10/2026");
		
		driver.findElement(By.id("txtDate")).sendKeys("01/11/2026");
		
		
		driver.findElement(By.id("start-date")).sendKeys("04/06/2026");
		
		driver.findElement(By.id("end-date")).sendKeys("07/10/2026");
		
		driver.findElement(By.className("submit-btn")).click();
		
		
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Harshada Mane\\Downloads\\Harshada Mane (5).pdf");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\Harshada Mane\\Downloads\\Harshada Mane (3).pdf");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
//		driver.findElement(By.id("footer-2-2")).click();
//		
//		WebElement outerframe =  driver.findElement(By.xpath("//input[@type='text']']"));
//		
//		driver.switchTo().frame(outerframe);
//		
//		
//		driver.findElement(By.xpath("//input[type()='checkbox']")).click();
//		driver.findElement(By.xpath("//table/tbody/tr")).click();
		
		
	}
	

	
	

}
