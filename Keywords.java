package com.orangehrm.base;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import com.orangehrm.applywait.WaitForElement;


public class Keywords {
static ChromeOptions options;
public static	 RemoteWebDriver driver;

static String title;
public static String title1;

public  static void openBrowser(String browserName) {
	if(browserName.equalsIgnoreCase("chrome")) {
		 options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		 driver=new ChromeDriver(options);
		 WaitForElement.initWait(); 
		 

	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		 driver=new EdgeDriver();
	}
	else if(browserName.equalsIgnoreCase("safari")) {
		driver=new SafariDriver();
	}
	else {
		throw new Error("Invalid Browser Name"+browserName);
	}
}
public static  void launchUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
public static  void closeBrowser() {
	
        driver.quit();
        
	
}
public static  void clickOnElement(String locatorType, String locatorValue) {
	getWebElement(locatorType, locatorValue).click();
		
	}
public static void handleAlert() {
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public static  WebElement getWebElement(String locatorType, String locatorValue) throws Error {
	WebElement element=null;
	if(locatorType.equalsIgnoreCase("css")) {
		element=driver.findElement(By.cssSelector(locatorValue));
	}
	else if(locatorType.equalsIgnoreCase("id")) {
		element=driver.findElement(By.id(locatorValue));
	}
		else if(locatorType.equalsIgnoreCase("name")) {
			element=driver.findElement(By.name(locatorValue));
		}
		
		else if(locatorType.equalsIgnoreCase("className")) {
			element=driver.findElement(By.className(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("linkText")) {
			element=driver.findElement(By.linkText(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("partialLinkText")) {
			element=driver.findElement(By.partialLinkText(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("tagName")) {
		element=	driver.findElement(By.tagName(locatorValue));
		}
	
		else
		{
			throw new Error("Invalid Locator Type: "+locatorType);
		}
	return element;
}
public static  void enterText(String locatorType, String locatorValue, String text) {
	getWebElement(locatorType, locatorValue).sendKeys(text);
	
	
}
public static void enterText(By EnterTextOnUsername, String text) {
	driver.findElement(EnterTextOnUsername).sendKeys(text);
}
public static void calenderMonthScrollDown(By locator) {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement calendar = driver.findElement(locator); 

	js.executeScript("arguments[0].scrollBy(0, 600);", calendar);

}

public static void javascriptScroll() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 500);"); // scroll down 500px

}

public static String getText(String locatorType, String locatorValue) {
	return getWebElement(locatorType, locatorValue).getText();
	
}
public static  void getTitleOfCurrentPage() {
	 title=driver.getTitle();
	 System.out.println("Actual title of page is :"+title);
}
public static  void getTitleOfPageIfMultipleWindows(String ExpectedTitle) {
Set<String> ids=	driver.getWindowHandles();
for(String id:ids) {
	driver.switchTo().window(id);
	 title1=driver.getTitle();
	if(title1.contains(ExpectedTitle)) {
		Assert.assertEquals(title1,ExpectedTitle);
break;
	}
}
}
public static void getUrlOfPage() {
	
	String url=driver.getCurrentUrl();
	if(url.contains("login")) {
		Assert.assertEquals(url, Environment.getLoginPageUrl());
	}
	else if(url.contains("pim")) {
		Assert.assertEquals(url, Environment.getUpdatePasswordUrl());
	}
}

public static void getUrlOfPageAssignLeave() {
	String winId=driver.getWindowHandle();
	driver.switchTo().window(winId);
	String url=driver.getCurrentUrl();
	if(url.contains("assignLeave")) {
		Assert.assertEquals(url, Environment.getAssignLeavePageUrl());
	}
}
public static void loginAssertion() {
	String url=driver.getCurrentUrl();
	if(url.contains("dashboard")) {
		Assert.assertEquals(url, Environment.getHomePageUrl());
	}
}

public static void checkErrorMsgWithInvalidUser(By ErrorMessageWithInvalidUsername) {
	WaitForElement.waitForElement(ErrorMessageWithInvalidUsername);
	String error_msg=driver.findElement(ErrorMessageWithInvalidUsername).getText();
if(error_msg.contains(Environment.getErrorMsgWithInvaliduser())) {
	Assert.assertEquals(error_msg, Environment.getErrorMsgWithInvaliduser());
}
}
public static void assertionCheck(String expectedTitleOfPage) {
	 Assert.assertEquals(title1, expectedTitleOfPage);
}
public static void assertion(String actualValue,String expectedValue) {
	Assert.assertEquals(actualValue, expectedValue);
}
public static void clickOnElement(String locator) {
String locatorType=locator.split("##")[0];
String locatorValue=locator.split("##")[1];
clickOnElement(locatorType,locatorValue);
}

public static String waitElement(String locator) {
	String locatorType=locator.split("##")[0];
	String locatorValue=locator.split("##")[1];
	return locatorValue;
}
public static String getText(String locator) {
	String locatorType=locator.split("##")[0];
	String locatorValue=locator.split("##")[1];
	return getText(locatorType,locatorValue);
}
public static void clickOnElement(By clickOnUsername) {
	//WebElement assignBtn = driver.findElement(clickOnUsername);
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();", assignBtn);
driver.findElement(clickOnUsername).click();

}
public static void partialClick(By name) {
	driver.findElements(name).get(1).click();}
public static void clickOnElement1(By clickOnPassword) {
	driver.findElement(clickOnPassword).click();
}

public static void enterText1(By enterTextOnPassword, String password) {
driver.findElement(enterTextOnPassword).sendKeys(password);	
}
public static void clickOnSubmit(By submitClick) {
driver.findElement(submitClick).click();	
}
public static void checkErrorMsgForBlankUsername(By ErrorMsgForBlankUsernamePasswordField) {
String ErrorMsgForUsernamePasswordBlankField=driver.findElement(ErrorMsgForBlankUsernamePasswordField)	.getText();
if(ErrorMsgForUsernamePasswordBlankField.contains(Environment.getErrorMsgForBlankUser())){
Assert.assertEquals(ErrorMsgForUsernamePasswordBlankField, Environment.getErrorMsgForBlankUser());	
}
}
public static void checkForgotPassword(By forgotPassword) {
driver.findElement(forgotPassword).click();
}
public static void verifyAppLogo(By CompanyBrand) {
Assert.assertTrue(driver.findElement(CompanyBrand).isDisplayed(), " orange hrm logo not displayed on home page...!");
}
public static void verifyOrangeHrmLogo(By OrangeHrmLogo) {
	Assert.assertTrue(driver.findElement(OrangeHrmLogo).isDisplayed(), " orange hrm logo not displayed on home page...!");
	
}
public static void getText(By verifySuccessfulResetPasswordMessage) {
String ResetPassowdSuccessMessage=driver.findElement(verifySuccessfulResetPasswordMessage).getText();	
if(ResetPassowdSuccessMessage.equals(Environment.getResetPasswordSuccessMessage())) {
	Assert.assertEquals(ResetPassowdSuccessMessage, Environment.getResetPasswordSuccessMessage());
}}
public static void verifySuccessMessage(By message) {
String msg=driver.findElement(message).getText();

	Assert.assertEquals(msg,"Success");

}
public static void verifyPageNavigation() {
	WaitForElement.waitUntilExpectedUrl();
	String url=driver.getCurrentUrl();
	if(url.equals(Environment.getLoginPageUrl())) {
		Assert.assertEquals(url,Environment.getLoginPageUrl());
	}
}
public static void clickOnElementassign(By submit) {
	WaitForElement.waitForElement(submit);
	WaitForElement.waitForElementToBeClickable(submit);
	WebElement assignBtn = driver.findElement(submit);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", assignBtn);
	
}
public static void getTextModalPopup(By modalPopup) {
String text=driver.findElement(modalPopup)	.getText();
if(text.contains("About")) {
	Assert.assertEquals(text, "About");
}
}

public static void verifySupportPageNavigation() {
String url=driver.getCurrentUrl();	
if(url.contains("support")) {
	Assert.assertEquals(url,Environment.getSupportPageUrl());
}
}
}


