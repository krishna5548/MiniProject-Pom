package com.AdactinProject;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	 public WebDriver driver;
	 
	 private Home_page hp;
	 
	 private LoginPage Login;
	 
	 private T_shirt Tshirt;
 
 public Page_Object_Manager(WebDriver driver2) {
	 this.driver=driver2;
 }
public Home_page getInstanceHp(){  //this method Use Get obj 
	 if(hp==null) {
		  hp =new Home_page(driver);
	 }
	 return hp;
 }
 public LoginPage getinstanceLogin() {
	 if(Login==null) {
		 Login= new LoginPage(driver);
	 }
	 return Login;
 }
 public T_shirt getinstanceTshirt() {
	 if(Tshirt==null) {
		 Tshirt = new T_shirt(driver);
	 }
	 return Tshirt;
 }
 
}
