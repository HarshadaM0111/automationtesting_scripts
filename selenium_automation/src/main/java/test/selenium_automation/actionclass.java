package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	ChromeDriver driver ;
	Actions act;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		actionclass ob =new actionclass();
		ob.mousehover();
		ob.serach();
		ob.draganddrop();
		ob.slider();

	}
	void mousehover() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		//Action class
		act = new Actions(driver);
		
		WebElement comp = driver.findElement(By.linkText("Computers"));
		act.moveToElement(comp).build().perform();
		Thread.sleep(2000);
	}
	void serach() {
		WebElement se = driver.findElement(By.id("small-searchterms"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Search']"));
		act.sendKeys(se, "laptop").click(button).perform();
		
	}
	void draganddrop() {
		driver.navigate().to("https://demo.automationtesting.in/Static.html");
		
		WebElement drag = driver.findElement(By.id("angular"));
		WebElement drop = driver.findElement(By.id("droparea"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}
	
	void slider() {
		WebElement widget = driver.findElement(By.linkText("Widgets"));
		
		act.moveToElement(widget).build().perform();
		
		driver.findElement(By.linkText("Slider"));
		
		WebElement sl = driver.findElement(By.id("slider"));
		act.dragAndDropBy(sl, 0, 20).build().perform();
	}
	

}
