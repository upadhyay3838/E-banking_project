package org.e_banking.base;

import java.io.IOException;
import java.util.Properties;

import org.e_banking_utilities.propertiesFileHandel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
public	WebDriver	driver;
public  Properties pr;	
@BeforeMethod
	public void browser() throws IOException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
		
	pr = propertiesFileHandel.prFileHandel("../E-Banking_Project/data.properties");
		String browser="chrome";
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		
		driver.get(pr.getProperty("url"));
			
		}
			
	}
	
	
	
}
