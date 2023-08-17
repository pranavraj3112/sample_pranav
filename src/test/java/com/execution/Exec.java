package com.execution;

import com.page.execution.LoginPage_Execution;

public class Exec extends LoginPage_Execution {

	public static void main(String[] args) {
		startBrowser("https://adactinhotelapp.com/");
		user();
		pass();
		click();
	}
}
