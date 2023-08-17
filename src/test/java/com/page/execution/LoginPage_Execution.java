package com.page.execution;

import com.Locator.LoginPage_Locator;
import com.baseclass.BaseClass;

public class LoginPage_Execution extends LoginPage_Locator {
	public static void user() {
		BaseClass.inputValue(LoginPage_Locator.username(), BaseClass.propertyFile("user"));
	}
	
	public static void pass() {
		BaseClass.inputValue(LoginPage_Locator.password(), BaseClass.propertyFile("pass"));
	}
	
	public static void click() {
		BaseClass.click(LoginPage_Locator.loginButton());
	}
}
