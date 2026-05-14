package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagintaionCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// PAgination CheckBox

		driver.findElement(By.linkText("1")).click();
		
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[4]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[5]/td[4]/input")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("2")).click();
		
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[4]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[5]/td[4]/input")).click();
	
		Thread.sleep(3000);

		
		
		driver.findElement(By.linkText("3")).click();
		
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[4]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[5]/td[4]/input")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[4]/td[4]/input")).click();
		driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[5]/td[4]/input")).click();
	
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
