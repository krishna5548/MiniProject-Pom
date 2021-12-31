package com.AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign_btn;

	public WebElement getSign_btn() {
		return sign_btn;
	}
	public Home_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
