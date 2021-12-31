package com.AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_shirt {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirt;
	
	@FindBy(xpath="(//input[@class='checkbox'])[1]")
	private WebElement Size_S;
	
	@FindBy(xpath="(//input[@class='checkbox'])[3]")
	private WebElement Size_L;
	
	@FindBy(id="selectProductSort")
	private WebElement selectProductSort;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement ClickProduct;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frameClick;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement frameBTNClick;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Checkout;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement twoCheckout;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement threeCheckout;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agreeCheckbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement fourCheckout;
	
	@FindBy(xpath="(//a[@title='Pay by bank wire'])")
	private WebElement payBybank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder;
	
	public WebElement getTShirt() {
		return TShirt;
	}
	public WebElement getSize_S() {
		return Size_S;
	}
	public WebElement getSize_L() {
		return Size_L;
	}
	public WebElement getClickProduct() {
		return ClickProduct;
	}
	public WebElement getselectProductSort() {
		return selectProductSort;
	}
	public WebElement getFrameClick() {
		return frameClick;
	}
	public WebElement getFrameBTNClick() {
		return frameBTNClick;
	}
	public WebElement getCheckout() {
		return Checkout;
	}
	public WebElement getTwocheckout() {
		return twoCheckout;
	}
	public WebElement getThreecheckout() {
		return threeCheckout;
	}
	public WebElement getAgreeCheckbox() {
		return agreeCheckbox;
	}
	public WebElement getFourCheckout() {
		return fourCheckout;
	}
	public WebElement getPayBybank() {
		return payBybank;
	}
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	public T_shirt (WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}
	
}

