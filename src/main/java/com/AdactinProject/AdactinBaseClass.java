package com.AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBaseClass {
	public static WebDriver driver;
	 
	 public static WebDriver browserLanch(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver96.exe");
			 ChromeOptions ch= new ChromeOptions();
			 ch.addArguments("incognito");
			 driver = new ChromeDriver(ch); 
			 driver.manage().window().maximize();
		 }
		 else if(browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.GECKO.driver", "//driver");
			  driver = new FirefoxDriver();
		 }
		 else {
			 System.out.println("Invelid Browser");
		 }
		 driver.manage().window().maximize();
		 return driver;
	 }
	 public static void openthepage(String str) {
		 driver.get(str);
	 }
	public static void Clickonelement(WebElement element) {
		element.click();
	}
	public static void inputElement(WebElement element,String input) {
		element.sendKeys(input);
	}
	 public static void DropDown(WebElement ele,String value,String i) {
		 Select s = new Select(ele);
		 if(value.equalsIgnoreCase("byValue")) {
			 s.selectByValue(i);
		 }
		 else if(value.equalsIgnoreCase("bytext")) {
			 s.selectByVisibleText(i); 
		 }
		 else if(value.equalsIgnoreCase("byIndex")) {
			 int index = Integer.parseInt(i);
			 s.selectByIndex(index);
		 }	
	 }

}
