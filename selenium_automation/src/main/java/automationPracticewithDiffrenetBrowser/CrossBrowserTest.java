package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

    static WebDriver driver;

    public static void main(String[] args) {

        String[] browsers = {"chrome", "edge", "firefox"};

        for(String browser : browsers) {

            // Browser Launch
            if(browser.equalsIgnoreCase("chrome")) {

                driver = new ChromeDriver();

            } else if(browser.equalsIgnoreCase("edge")) {

                driver = new EdgeDriver();

            } else if(browser.equalsIgnoreCase("firefox")) {

                driver = new FirefoxDriver();
            }

            driver.manage().window().maximize();

            System.out.println("Running on: " + browser);

            // Test Case 1
            positiveLoginTest();

            // Test Case 2
            negativeUsernameTest();

            // Test Case 3
            negativePasswordTest();

            driver.quit();

            System.out.println("=======================");
        }
    }

    
    
    // Positive Login Test
    static void positiveLoginTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String url = driver.getCurrentUrl();

        if(url.contains("logged-in-successfully")) {

            System.out.println("Positive Login Passed");
        }
    }

    
    
    // Negative Username Test
    static void negativeUsernameTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("incorrectUser");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String error =
                driver.findElement(By.id("error")).getText();

        if(error.equals("Your username is invalid!")) {

            System.out.println("Negative Username Passed");
        }
    }
    
    

    // Negative Password Test
    static void negativePasswordTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("incorrectPassword");

        driver.findElement(By.id("submit")).click();

        String error =
                driver.findElement(By.id("error")).getText();

        if(error.equals("Your password is invalid!")) {

            System.out.println("Negative Password Passed");
        }
    }
}