package automationPracticewithDiffrenetBrowser;

import org.openqa.selenium.By;

public class NegativeUsernameTest  extends TestCrossBrowser {

    public void negativeUsernameTest(String browser) {

        browserSetUp(browser);

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("incorrectUser");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String error =
                driver.findElement(By.id("error")).getText();

        if(error.equals("Your username is invalid!")) {

            System.out.println(browser + " : Negative Username Passed");
        }

        driver.quit();
    }
}