package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class LoginPage_Locator extends BaseClass {
	public static WebElement username() {
		return wd.findElement(By.id("username"));
	}
	
	public static WebElement password() {
		return wd.findElement(By.id("password"));
	}
	
	public static WebElement loginButton() {
		return wd.findElement(By.id("login"));
	}
}
