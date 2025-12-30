package com.orangehrm.applywait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.base.Keywords;

public class WaitForElement {

    // Shared FluentWait object
    private static FluentWait<RemoteWebDriver> wait;

    /**
     * Initialize FluentWait once WebDriver is ready.
     * Must be called after browser is launched.
     */
    public static void initWait() {
        wait = new FluentWait<>(Keywords.driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .withMessage("Element not found within timeout");
    }

    /** Wait for element located by CSS selector string */
    public static void visibilityOfElement(String locator) {
        String locatorValue = Keywords.waitElement(locator);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
    }

    /** Wait for element located by WebElement */
  /*  public static void visibilityOfElement(WebElement e) {
        String value = e.toString();
        System.out.println("value is " + value);
        try {
            String locator = value.split("css selector:")[1].trim().split("]")[0] + "]";
            System.out.println("locator after split " + locator);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        } catch (Exception ex) {
            System.out.println("Unable to extract CSS locator from element: " + ex.getMessage());
        }
    }*/

    /** Wait for specific locator (By) */
    public static void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void waitForElementToBeClickable(By locator) {
    	wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /** Wait until expected title is visible */
    public static void waitUntilExpectedTitle(String title) {
        wait.until(ExpectedConditions.titleContains(title));
    }

    /** Wait until expected URL contains 'dashboard' */
    public static void waitUntilExpectedUrl() {
        String url = Keywords.driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        if (url.contains("dashboard")) {
            Assert.assertEquals(url, expectedUrl);
        }
    }

	public static void waitForPassword(By waitForPassword) {
wait.until(ExpectedConditions.visibilityOfElementLocated(waitForPassword))	;	
	}

	public static void visibilityOfPassword(WebElement password) {
System.out.println(password);
	}

	public static void waitForElementandGetText(By verifySuccessfulResetPasswordMessage) {
wait.until(ExpectedConditions.visibilityOfElementLocated(verifySuccessfulResetPasswordMessage))	;

	}
}
