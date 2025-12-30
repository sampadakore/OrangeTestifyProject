package com.orangehrm.stepdefinitions;

import com.orangehrm.applywait.WaitForElement;
import com.orangehrm.base.Keywords;
import com.orangehrm.pages.DashboardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardPageSteps  {
	
	@When ("user click on Assign Leave tab")
	public void clickOnAssignLeaveOption() {
	DashboardPage d=new DashboardPage();
	d.waitForAssignLeave();
	d.clickOnAssignLeave();
	}
	@Then ("Assign leave page should open successfully")
	public void verifyPageNavigation() {
		Keywords.getUrlOfPageAssignLeave();
		Keywords.closeBrowser();
	}
	@When ("user enter employee name as {string}")
	public void enterEmployeeName(String empName) {
		DashboardPage d=new DashboardPage();
		d.waitForEmployeeName();
		d.enterTextOnEmployeeNameField(empName);
		d.waitForEmployeeNameOption();
		d.waitAndClickOnEmployeeName();
	}
	@And ("select leave type")
	public void selectLeaveType() {
		DashboardPage d=new DashboardPage();
		d.clickOnDropdown();
		d.waitForOptionLeaveType();
		d.clickOnOption();
	}
	@And ("select from date")
	public void selectFromDate() {
		DashboardPage d=new DashboardPage();
d.clickOnFromDate();
d.waitForMonthDropDownFromDate();
d.clickOnMonthDropDown();
d.scrollDownWindow();
d.waitForSelectNov();
d.clickOnNovember();
d.clickOnYearDropDown();
d.waitForSelectYear();
d.clickOnMonth();
d.waitForSelectDateFromDate();
d.clickOnDate();
}
@And ("select to date")
public void selectToDate() {
	DashboardPage d=new DashboardPage();
	d.clickOnToDate();
	d.waitForSelectExactToDate();
	d.clickOnDate1();
}
@And ("select partial days")
public void selectPartialDay() {
	DashboardPage d=new DashboardPage();
	d.waitForPartialDayDropDown();
d.clickOnPartialDropDown();
d.waitForStartAndEndDay();
d.selectStartAndEndDayOption();
d.waitForStartDayDropDown();
d.clickOnStartDayDropDown();
d.waitForSelectHalfDayMoriningOption();
d.clickOnSelectHalfDayMorning();
d.waitEndDayDropDown();
d.clickEndDayDropDown();
d.selectHalfDayAfternoonWait();
d.clickOnSelectHalfDayAfternoonOption();
}
@And ("Add comments {string}")
public void addComment(String text) {
	DashboardPage d=new DashboardPage();
d.clickOnCommens(text);
//Keywords.javascriptScroll();
}
@And ("click on Assign")
public void clickOnAssign() {
	DashboardPage d=new DashboardPage();
	Keywords.javascriptScroll();
	d.waitForSubmit();
	d.clickOnAssign();
}
@And ("click ok on modal popup")
public void clickOnModalPopup() {
	DashboardPage d=new DashboardPage();
	d.waitForPopup();
d.clickOnPopup();
}
@Then ("it will show success message")
public void verifySuccessMsg() {
	DashboardPage d=new DashboardPage();
	d.verifySuccessMsg();
}
@When ("user click on userdropdown")
public void clickOnUserDropdown() {
	DashboardPage d=new DashboardPage();
	d.waitForVisibilityOfLoginUserDropdown();
	d.clickonLoginUserDropdown();
	
}
@And ("click on logout option")
public void clickOnLogout() {
	DashboardPage d=new DashboardPage();
	d.clickOnLogout();
}

@Then ("user should navigate to login page successfully")
public void verifyPageNav() {
	WaitForElement.waitUntilExpectedTitle("OrangeHRM");
	Keywords.verifyPageNavigation();
	
}
@And ("click on about option")
public void verifyAbout() {
	DashboardPage d=new DashboardPage();
d.verifyAbout();}
@Then ("About modal popup should open")
public void verifyModalPopup() {
	DashboardPage d=new DashboardPage();
d.verifyModalPopup();	
}
@And ("click on support")
public void verifySupport() {
	DashboardPage d=new DashboardPage();
d.verifySupportOption();
}
@Then ("user should navigate to support page successfully")
public void verifyPageNavigation1() {
	
	Keywords.verifySupportPageNavigation();
}
@And ("click on Change Password")
public void clickOnChangePassword() {
	DashboardPage d=new DashboardPage();
d.clickOnChangePassword();	


}
@Then ("user should navigate to update password page successfully")
public void verifyPageNavigationofUpdatePassword() {
Keywords.getUrlOfPage();
}

}





