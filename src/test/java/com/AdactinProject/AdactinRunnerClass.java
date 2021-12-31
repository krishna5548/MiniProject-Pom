package com.AdactinProject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;

//import com.properties.File_Reader_Manager;

public class AdactinRunnerClass extends AdactinBaseClass {
	public static WebDriver driver = browserLanch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	static Logger log=Logger.getLogger(AdactinRunnerClass.class);
	public static void main(String[] args) throws Throwable {
		BasicConfigurator.configure();
		String url = File_Reader_Manager.getInstanceFRM().getinstanceCR().geturl();
		String username=File_Reader_Manager.getInstanceFRM().getinstanceCR().getusername();
		String password=File_Reader_Manager.getInstanceFRM().getinstanceCR().getpassword();
		openthepage(url);
		log.info("Get UrL Successfully");
		Clickonelement(pom.getInstanceHp().getSign_btn());
		inputElement(pom.getinstanceLogin().getUsername(), username);
		inputElement(pom.getinstanceLogin().getPassword(),password);
		Clickonelement(pom.getinstanceLogin().getSignin_btn());
		log.info("Login Successfully");
		Clickonelement(pom.getinstanceTshirt().getTShirt());
		Clickonelement(pom.getinstanceTshirt().getSize_S());
		Clickonelement(pom.getinstanceTshirt().getSize_L());
		DropDown(pom.getinstanceTshirt().getselectProductSort(),"byvalue", "price:asc");
		Clickonelement(pom.getinstanceTshirt().getClickProduct());
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.switchTo().frame(pom.getinstanceTshirt().getFrameClick());
		Clickonelement(pom.getinstanceTshirt().getFrameBTNClick());
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		Clickonelement(pom.getinstanceTshirt().getCheckout());
		Clickonelement(pom.getinstanceTshirt().getTwocheckout());
		Clickonelement(pom.getinstanceTshirt().getThreecheckout());
		Clickonelement(pom.getinstanceTshirt().getAgreeCheckbox());
		Clickonelement(pom.getinstanceTshirt().getFourCheckout());
		Clickonelement(pom.getinstanceTshirt().getPayBybank());
		Clickonelement(pom.getinstanceTshirt().getConfirmOrder());
		Clickonelement(pom.getinstanceTshirt().getFourCheckout());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\muthu\\eclipse-workspace\\AdactinProject\\Screenshots\\test.png");
		FileUtils.copyFile(source, destination);
		
	}
}
