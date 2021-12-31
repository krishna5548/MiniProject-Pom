package com.AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;// Null
	
	@FindBy(id="email")
	private WebElement username;

	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement Signin_btn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_btn() {
		return Signin_btn;
	}

	public LoginPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
}
