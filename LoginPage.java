package com.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.applywait.WaitForElement;
import com.orangehrm.base.Keywords;

public class LoginPage {
	
	
	public By WaitForUsername=By.cssSelector("input[name='username']");
	public void waitForUsername() {
		WaitForElement.waitForElement(WaitForUsername);
	}
	public By WaitForPassword=By.cssSelector("input[type='password']");
	public void waitForPassword() {
		WaitForElement.waitForPassword(WaitForPassword);
	}
	public By ClickOnUsername=By.cssSelector("input[name='username']");
	public void clickOnUsername() {
		Keywords.clickOnElement(ClickOnUsername);
	}
	public By EnterTextOnUsername=By.cssSelector("input[name='username']");
	public void enterTextOnUsername(String username) {
		Keywords.enterText(EnterTextOnUsername, username );
			}
	public By ClickOnPassword=By.cssSelector("input[type='password']");
	public void clickOnPassword() {
		Keywords.clickOnElement1(ClickOnPassword);
	}
	public By EnterTextOnPassword=By.cssSelector("input[type='password']");
	public void enterTextOnPassword(String password) {
		Keywords.enterText1(EnterTextOnPassword, password);
	}
	public By SubmitClick=By.cssSelector("button[type='submit']");
	public void clickOnSubmit() {
		Keywords.clickOnSubmit(SubmitClick);
	}
	public By ErrorMessageWithInvalidUsername=By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text");
	public void checkErrorMsg() {
	Keywords.checkErrorMsgWithInvalidUser(ErrorMessageWithInvalidUsername);	
	}
	
	public By ErrorMsgForBlankUsernamePasswordField=By.cssSelector("span.oxd-text");
	public void checkMessageForUsernamePasswordBlankField() {
		Keywords.checkErrorMsgForBlankUsername(ErrorMsgForBlankUsernamePasswordField);
	}
	public By ForgotPassword=By.cssSelector("div.orangehrm-login-forgot>p");
	public void checkForgotPassword() {
		WaitForElement.waitForElement(ForgotPassword);
		Keywords.checkForgotPassword(ForgotPassword);
	}
	public By UsernameFieldOnPasswordResetCodePage=By.cssSelector("input[name='username']");
	public void waitForUsernameField() {
		WaitForElement.waitForElement(UsernameFieldOnPasswordResetCodePage);
		
	}
	public By UsernameOnPasswordResetPage=By.cssSelector("input[name='username']");
	public void enterTextOnUsernameOnPasswordResetPage(String text) {
		Keywords.enterText(UsernameOnPasswordResetPage, text);
	}
	public By SubmitButtonOnResetPasswordPage=By.cssSelector("button[type='submit']");
	public void clickOnResetPassword() {
		Keywords.clickOnSubmit(SubmitButtonOnResetPasswordPage);
	}
	public By VerifySuccessfulResetPasswordMessage=By.cssSelector("h6.oxd-text");
	public void verifySuccessMessage() {
	WaitForElement.waitForElementandGetText(VerifySuccessfulResetPasswordMessage);	
	Keywords.getText(VerifySuccessfulResetPasswordMessage);
	}
	public By OrangeHrmIncHyperlink=By.cssSelector("a[href='http://www.orangehrm.com']");
	public void clickOnOrangHrmHyperlink() {
		WaitForElement.waitForElement(OrangeHrmIncHyperlink);
		Keywords.clickOnElement(OrangeHrmIncHyperlink);
	}
	public By CompanyBrand=By.cssSelector("img[alt='company-branding']");
	public void verifyLogoOnHomePage() {
		WaitForElement.waitForElement(CompanyBrand);
		Keywords.verifyAppLogo(CompanyBrand);
	}
	public By OrangeHrmLogo=By.cssSelector("div.orangehrm-login-logo>img[alt='orangehrm-logo']");
public void verifyOrangeHrmLogo() {
	WaitForElement.waitForElement(OrangeHrmLogo);
	Keywords.verifyOrangeHrmLogo(OrangeHrmLogo);
}

}
