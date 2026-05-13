package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.By;

public class NegativePasswordTest extends TestCrossBrowser {

    public void negativePasswordTest(String browser) {

        browserSetUp(browser);

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("incorrectPassword");

        driver.findElement(By.id("submit")).click();

        String error =
                driver.findElement(By.id("error")).getText();

        if(error.equals("Your password is invalid!")) {

            System.out.println(browser + " : Negative Password Passed");
        }

        driver.quit();
    }
}