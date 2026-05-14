package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tane");
		
	
	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("stane12@gmail.com");
		
	//	driver.findElement(By.xpath("//input[@text='tel']")).sendKeys("4562864312");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("4356782345");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@name='radiooptions']")).click();
		driver.findElement(By.xpath("//input[@value=FeMale]")).click();
		
		Select sel1 = new Select(driver.findElement(By.id("Skills")));
		
		sel1.selectByIndex(5);
		
		
		//sel1.selectByVisibleText("Android");
		
	}
	
	

}
