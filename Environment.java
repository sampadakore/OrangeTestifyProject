package com.orangehrm.base;

import com.oragehrm.utilities.PropUtil;

public class Environment {

	public static String getBrowserName() {
String baseDir=System.getProperty("user.dir");
return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "browser_name");

	}
	public static String getPageTitle() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "OrangeHrm_HomePage_Title");

	}
	public static String getResourceManagementPageTitle() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "OrangeHrm_ResourceManagement");

		
	}
	public static String getAssignLeavePageUrl() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "assignLeavePageUrl");
	}
	public static String getLoginPageUrl() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "login_page_url");

	}
	public static String getHomePageUrl() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "Home_Page_url");

	}
	public static String getSupportPageUrl() {
		
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "supportpageurl");

	}
	public static String getUpdatePasswordUrl() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "updatePasswordPageUrl");
	}
	public static String getErrorMsgWithInvaliduser() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "ErrorMsg_withInvalidUsername");

	}
	public static String getErrorMsgForBlankUser() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "ErrorMsgForUsernameBlankField");

	}
	public static String getResetPasswordSuccessMessage() {
		String baseDir=System.getProperty("user.dir");
		return PropUtil.getProperty(baseDir+"/src/main/resources/Environment.properties", "ResetPasswordSuccessMessage");

	}

}
