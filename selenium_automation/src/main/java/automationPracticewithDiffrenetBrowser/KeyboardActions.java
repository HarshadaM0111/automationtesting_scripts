package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardActions {

	public static void main(String args[]) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?hl=in");
		
		WebElement search = driver.findElement(By.tagName("textarea"));
		search.sendKeys("Software Testing");
		search.sendKeys(Keys.ENTER);
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement se = driver.findElement(By.id("small-searchterms"));
		se.sendKeys("books");
		se.sendKeys(Keys.ENTER);
		
		// Register 
		driver.findElement(By.linkText("Register")).click();
		
		// firstname
		
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("Harshada");
		fname.sendKeys(Keys.CONTROL+"A");
		
		//Copy
		fname.sendKeys(Keys.CONTROL+"C");
		
		// Paste
		
		WebElement lname = driver.findElement(By.id("LastName"));
		
		lname.sendKeys(Keys.CONTROL+"V");
		
		// Tab keyword
		
		WebElement tab1 = driver.findElement(By.linkText("Books"));
		tab1.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement tab2 = driver.findElement(By.linkText("Computers"));
		tab2.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		WebElement tab3 = driver.findElement(By.linkText("Electronics"));
		tab3.sendKeys(Keys.TAB);
		
		// complete all the keywords Action within 2 days 
		
	}
}
