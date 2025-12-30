package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.applywait.WaitForElement;
import com.orangehrm.base.Keywords;

public class DashboardPage  {
	public By WaitForAssignLeave=By.cssSelector("button[title='Assign Leave']");
	public void waitForAssignLeave() {
		WaitForElement.waitForElement(WaitForAssignLeave);

	}
public By AssignLeave=By.cssSelector("button[title='Assign Leave']");
public void clickOnAssignLeave() {
	Keywords.clickOnElement(AssignLeave);
}
public By EmployeeNameWait=By.cssSelector("input[placeholder='Type for hints...']");
public void waitForEmployeeName() {
	WaitForElement.waitForElement(EmployeeName);

}
public By EmployeeName=By.cssSelector("input[placeholder='Type for hints...']");
public void enterTextOnEmployeeNameField(String empName) {
	Keywords.enterText(EmployeeName, empName);
}
public By EmployeeNameOptionWait=By.cssSelector("div.oxd-autocomplete-option");
public void waitForEmployeeNameOption() {
	WaitForElement.waitForElement(EmployeeNameOptionWait);

}
public By EmployeeNameOption=By.cssSelector("div.oxd-autocomplete-option");
public void waitAndClickOnEmployeeName() {
	Keywords.clickOnElement(EmployeeNameOption);
}
public By LeaveTypeDropDown=By.cssSelector("div.oxd-select-text--after i.oxd-icon");
public void clickOnDropdown() {
	Keywords.clickOnElement(LeaveTypeDropDown);
}
public By WaitForOptionToBeSelectForLeaveType=By.cssSelector(".oxd-select-option:nth-child(5) span");
public void waitForOptionLeaveType() {
	WaitForElement.waitForElement(WaitForOptionToBeSelectForLeaveType);

}
public By OptionToBeSelectForLeaveType=By.cssSelector(".oxd-select-option:nth-child(5) span");
public void clickOnOption() {
	Keywords.clickOnElement(OptionToBeSelectForLeaveType);
}
public By FromDate=By.cssSelector(".oxd-grid-item:nth-of-type(1) .oxd-date-input-icon");
public void clickOnFromDate() {
	Keywords.clickOnElement(FromDate);
}
public By WaitForMonthDropDownFromDate=By.cssSelector("div.oxd-calendar-selector-month-selected>.oxd-icon-button__icon");
public void waitForMonthDropDownFromDate() {
	WaitForElement.waitForElement(WaitForMonthDropDownFromDate);

}
public By MonthDropDownFromDate=By.cssSelector("div.oxd-calendar-selector-month-selected>.oxd-icon-button__icon");
public void clickOnMonthDropDown() {
	Keywords.clickOnElement(MonthDropDownFromDate);
}
public By CalenderMonthScrollDown=By.cssSelector("div.oxd-calendar-selector-month-selected>.oxd-icon-button__icon");
public void scrollDownWindow() {
	Keywords.calenderMonthScrollDown(CalenderMonthScrollDown);
}
public By SelectNovWait=By.cssSelector("li.oxd-calendar-dropdown--option:nth-child(11)");
public void waitForSelectNov() {
	WaitForElement.waitForElement(SelectNovWait);
	
}
public By SelectNovember=By.cssSelector("li.oxd-calendar-dropdown--option:nth-child(11)");
public void clickOnNovember() {
	Keywords.clickOnElement(SelectNovember);
}
public By SelectYear=By.cssSelector("div.oxd-calendar-selector-year-selected i.oxd-icon-button__icon");
public void clickOnYearDropDown() {
	Keywords.clickOnElement(SelectYear);
}
public By WaitForSelectYear=By.cssSelector("li.oxd-calendar-dropdown--option:nth-child(51)");
public void waitForSelectYear() {
	WaitForElement.waitForElement(WaitForSelectYear);
	
}
public By SelectExactYear=By.cssSelector("li.oxd-calendar-dropdown--option:nth-child(51)");
public void clickOnMonth() {
	Keywords.clickOnElement(SelectExactYear);
}
public By SelectDateFromDateWait=By.cssSelector("div.oxd-calendar-date-wrapper:nth-child(27)");
public void waitForSelectDateFromDate() {
	WaitForElement.waitForElement(SelectDateFromDateWait);
	
}
public By SelectDateFromDate=By.cssSelector("div.oxd-calendar-date-wrapper:nth-child(27)");
public void clickOnDate() {
	Keywords.clickOnElement(SelectDateFromDate);
}

public By ToDate=By.cssSelector(".oxd-grid-item:nth-of-type(2) .oxd-date-input-icon");
public void clickOnToDate() {
	Keywords.clickOnElement(ToDate);
}
public By SelectExactToDateWait=By.cssSelector("div.oxd-calendar-date-wrapper:nth-child(28)");
public void waitForSelectExactToDate() {
	WaitForElement.waitForElement(SelectExactToDateWait);
	
}
public By SelectExactToDate=By.cssSelector("div.oxd-calendar-date-wrapper:nth-child(28)");
public void clickOnDate1() {
	Keywords.clickOnElement(SelectExactToDate);
}
public By WaitForPartialDayDropDown=By.cssSelector("div.oxd-grid-4 div.oxd-select-text");
public void waitForPartialDayDropDown() {
	WaitForElement.waitForElement(WaitForPartialDayDropDown);
}
public By PartialDaysDropDown=By.cssSelector("div.oxd-grid-4 div.oxd-select-text");
public void clickOnPartialDropDown() {
	Keywords.clickOnElement(PartialDaysDropDown);
}
public By SelectStartAndEndDayOptionWait=By.cssSelector("div.oxd-select-option:nth-of-type(5) span");
public void waitForStartAndEndDay() {
	WaitForElement.waitForElement(SelectStartAndEndDayOptionWait);

}
public By SelectStartAndEndDayOption=By.cssSelector("div.oxd-select-option:nth-of-type(5) span");
public void selectStartAndEndDayOption() {
	Keywords.clickOnElement(SelectStartAndEndDayOption);
}
public By StartDayDropDownWait=By.cssSelector("div.oxd-grid-item:nth-of-type(2) div.oxd-select-text--after i");
public void waitForStartDayDropDown() {
	WaitForElement.waitForElement(StartDayDropDownWait);
	
}
public By StartDayDropDown=By.cssSelector("div.oxd-grid-item:nth-of-type(2) div.oxd-select-text--after i");
public void clickOnStartDayDropDown() {
	Keywords.clickOnElement(StartDayDropDown);
}
public By SelectHalfDayMorningOptionWait=By.cssSelector("div[role='option']:nth-child(2) span");
public void waitForSelectHalfDayMoriningOption() {
	WaitForElement.waitForElement(SelectHalfDayMorningOptionWait);

}
public By SelectHalfDayMorningOption=By.cssSelector("div[role='option']:nth-child(2) span");
public void clickOnSelectHalfDayMorning() {
	Keywords.clickOnElement(SelectHalfDayMorningOption);
}
public By EndDayDropDown=By.cssSelector("div.oxd-grid-item:nth-of-type(3) div.oxd-select-text--after i");
public void waitEndDayDropDown() {
	WaitForElement.waitForElement(EndDayDropDown);
}
public By EndDayDropDownClick=By.cssSelector("div.oxd-grid-item:nth-of-type(3) div.oxd-select-text--after i");
public void clickEndDayDropDown() {
	Keywords.clickOnElement(EndDayDropDownClick);
}
public By WaitForSelectHalfDayAfternoonOption=By.cssSelector("div[role='option']:nth-child(3) span");
public void selectHalfDayAfternoonWait() {
	WaitForElement.waitForElement(WaitForSelectHalfDayAfternoonOption);

}
public By SelectHalfDayAfternoonOption=By.cssSelector("div[role='option']:nth-child(3) span");
public void clickOnSelectHalfDayAfternoonOption() {
	Keywords.clickOnElement(SelectHalfDayAfternoonOption);
}
public By AddComments=By.cssSelector("div>textarea");
public void clickOnCommens(String userinput) {
	Keywords.clickOnElement(AddComments);
	Keywords.enterText(AddComments, userinput);
}
public By WaitForSubmit=By.cssSelector("button[type='submit']");
public void waitForSubmit() {
	WaitForElement.waitForElement(WaitForSubmit);
	WaitForElement.waitForElementToBeClickable(WaitForSubmit);
}
public By Submit=By.cssSelector("button[type='submit']");
public void clickOnAssign() {
	Keywords.clickOnElementassign(Submit);
}
public By WaitForPopup=By.cssSelector("div.orangehrm-modal-footer button:nth-child(2)");
public void waitForPopup() {
	WaitForElement.waitForElement(WaitForPopup);
}
public By popup=By.cssSelector("div.orangehrm-modal-footer button:nth-child(2)");
public void clickOnPopup() {
	Keywords.clickOnElement(popup);
}
public By SuccessMsg=By.cssSelector("div.oxd-toast-content--success p:nth-child(1)");
public void verifySuccessMsg() {
Keywords.verifySuccessMessage(SuccessMsg);	
}
public By LoginUserDropdown=By.cssSelector("span.oxd-userdropdown-tab>i");
public void clickonLoginUserDropdown() {
	Keywords.clickOnElement(LoginUserDropdown);
}
public By LoginUserDropdownarrow=By.cssSelector("span.oxd-userdropdown-tab>i");
public void waitForVisibilityOfLoginUserDropdown() {
	WaitForElement.waitForElement(LoginUserDropdownarrow);
}
public By Logout=By.cssSelector("a[href='/web/index.php/auth/logout']");
public void clickOnLogout() {
	Keywords.clickOnElement(Logout);
}
public By About=By.cssSelector("a[href='#']");
public void verifyAbout() {
	WaitForElement.waitForElement(About);
	Keywords.clickOnElement(About);
}
public By ModalPopup=By.cssSelector("h6.orangehrm-main-title");
public void verifyModalPopup() {
	WaitForElement.waitForElement(ModalPopup);
	Keywords.getTextModalPopup(ModalPopup);
}
public By Support=By.cssSelector("a[href=\"/web/index.php/help/support\"]");
public void verifySupportOption() {
	WaitForElement.waitForElement(Support);
	Keywords.clickOnElement(Support);
}

public By ChangePassword=By.cssSelector("a[href=\"/web/index.php/pim/updatePassword\" ]");
public void clickOnChangePassword() {
	WaitForElement.waitForElement(ChangePassword);
	Keywords.clickOnElement(ChangePassword);
}
}