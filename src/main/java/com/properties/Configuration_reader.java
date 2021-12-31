package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {
	public static Properties p;
	   
	   public Configuration_reader() throws Throwable {
		   File f = new File("C:\\Users\\muthu\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\properties\\Configuration.properties");
			
		   FileInputStream fls = new FileInputStream(f);
			
		   p =new Properties();
			 
		   p.load(fls);
	   }
		public String geturl(){
			String url = p.getProperty("url");
			return url;
		}
		public String getusername(){
			String username = p.getProperty("username");
			return username;
		}
		public String getpassword(){
			String pass = p.getProperty("password");
			return pass;
		}

}
