package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.By;

public class PositiveLoginTest extends TestCrossBrowser {

    public void positiveLoginTest(String browser) {

        browserSetUp(browser);

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String url = driver.getCurrentUrl();

        if(url.contains("logged-in-successfully")) {

            System.out.println(browser + " : Positive Login Passed");
        }

        driver.quit();
    }
}