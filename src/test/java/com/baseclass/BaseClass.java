package com.baseclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver wd =null;
	
	public static void startBrowser(String url) {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(url);
	}
	
	public static String propertyFile(String val) {
		String property = null;
		
		try {
			File f = new File("C:\\\\Users\\\\Pranav\\\\eclipse-workspace\\\\com.rework\\\\src\\\\test\\\\resources\\\\HotelLogin.properties");
			FileReader fr = new FileReader(f);
			Properties prop = new Properties();
			prop.load(fr);
			property =prop.getProperty(val);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;
		}
	public static void inputValue(WebElement ele,String Data) {
		ele.sendKeys(Data);
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void dropDown(WebElement ele, String Data) {
		Select sc = new Select(ele);
		sc.selectByValue(Data);
	}
}
