package org.e_banking.page;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Manager_LoginPage {
	WebDriver driver;
	Properties pr;
public	Manager_LoginPage(WebDriver driver,Properties pr ){
		this.pr=pr;
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(how=How.NAME,using="uid")WebElement userid;
@FindBy(how=How.NAME,using="password")WebElement password;
@FindBy(how=How.NAME,using="btnLogin")WebElement clkLogin;


public void setUserID(String userID) {
	
	userid.sendKeys(userID);
	}

public void setPassword(String pasword) {
	
	password.sendKeys(pasword);
	}

public void loginButton() {

clkLogin.click();

}

	



}
