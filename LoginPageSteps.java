package com.orangehrm.stepdefinitions;

import com.orangehrm.base.Environment;
import com.orangehrm.base.Keywords;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	@Given("browser is opened and app url is launched")
public void launchUrl() {
		Keywords.openBrowser("chrome");
		Keywords.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
	@When("user enter username as {string}")
	public void enterUsername(String username) {
		LoginPage pg=new LoginPage();
		pg.waitForUsername();
		pg.enterTextOnUsername(username);
	}
	
	@And("user enter password as {string}")
	public void enterPassword(String password) {
	LoginPage pg=new LoginPage();
	pg.waitForPassword();
	pg.enterTextOnPassword(password);
	}
	@And("click on submit")
	public void clickOnSubmit() {
		LoginPage pg=new LoginPage();
		pg.clickOnSubmit();
	}
	
	@Then("user should see {string}")
	public void verifyMessage(String message) {
		if(message.contains("Dashboard")){
			
			Keywords.loginAssertion();
		}
		else if(message.contains("Invalid")) {
			LoginPage pg=new LoginPage();
			pg.checkErrorMsg();
			Keywords.closeBrowser();	
		}
		else if(message.contains("Required")) {
			LoginPage pg=new LoginPage();
			pg.checkMessageForUsernamePasswordBlankField();
			Keywords.closeBrowser();	
		}
		//Keywords.closeBrowser();
	}
	@When("user enter invalid username as {string}")
	public void enterInvalidUsername(String username) {
	LoginPage pg=new LoginPage();
	pg.waitForUsername();
	pg.enterTextOnUsername(username);
	}
	@Then("user should not able to login and give error message as invalid credentials")
	public void assertionForInvalidUsername() {
		LoginPage pg=new LoginPage();
		pg.checkErrorMsg();
		Keywords.closeBrowser();
	}
	@And("invalid password as {string}")
	public void enterInvalidPassword(String password) {
		LoginPage pg=new LoginPage();
		pg.waitForPassword();
		pg.enterTextOnPassword(password);
		}
	@When("user kept username field blank")
	public void username() {
		
	}
	@Then("user should not able to login and give error message as required in respective field")
	public void checErrorkMessageForBlankUsernamePassword() {
		LoginPage pg=new LoginPage();
		pg.checkMessageForUsernamePasswordBlankField();
		Keywords.closeBrowser();
	}
	@And("user kept password field blank")
	public void password() {
	}
	@And("user kept password field also blank")
	public void checkPasswordField() {
		LoginPage pg=new LoginPage();
		pg.waitForPassword();
	}
	@When("user click on forgot password option")
	public void clickOnForgotPassword() {
		LoginPage pg=new LoginPage();
		pg.checkForgotPassword();
	}
	@And("type username as {string} in username field on password reset page")
	public void enterUsernameForPasswordReset(String username) {
		LoginPage pg=new LoginPage();
		pg.waitForUsernameField();
		pg.enterTextOnUsernameOnPasswordResetPage(username);}
		@And ("click on reset password button")
public void clickOnResetPassword() {
			LoginPage pg=new LoginPage();
		pg.clickOnResetPassword();}
		@Then("user should get reset password link sent successful message")
public void verifySuccessMessage() {
			LoginPage pg=new LoginPage();
		pg.verifySuccessMessage();
		Keywords.closeBrowser();
		}
		@When ("user click on OrangeHrm Inc Hyperlink")
		public void clickOnOrangheHrmHyperlink() {
			LoginPage pg=new LoginPage();
			pg.clickOnOrangHrmHyperlink();
		}
		@Then ("user should navigate to page showing title Human Resource Management")
		public void checkPageNavigation() {
			Keywords.getTitleOfPageIfMultipleWindows(Environment.getResourceManagementPageTitle());
		Keywords.closeBrowser();
		}
		@Then ("Application logo should be visible on home page of application")
		public void verifyCompanyLogo() {
			LoginPage pg=new LoginPage();
			pg.verifyLogoOnHomePage();
			Keywords.closeBrowser();
		}

		@Then ("OrangeHrm logo should be visible on home page of application")
		public void verifyOrangeHrmLogo() {
			LoginPage pg=new LoginPage();
			pg.verifyOrangeHrmLogo();
			Keywords.closeBrowser();
		}


	}


