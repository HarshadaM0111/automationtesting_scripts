package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCrossBrowser {

    protected WebDriver driver;

    public void browserSetUp(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        } else if(browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();  // firefox driver name is gekoDriver   
            // session not match error means compatability is not match here 
        }

        driver.manage().window().maximize();
    }
}