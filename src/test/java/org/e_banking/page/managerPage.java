package org.e_banking.page;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class managerPage {
	WebDriver driver;
	Properties pr;
public	managerPage(WebDriver driver,Properties pr ){
		this.pr=pr;
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



@FindBy(how=How.NAME,using="uid")WebElement userid;
@FindBy(how=How.NAME,using="password")WebElement password;
@FindBy(how=How.NAME,using="btnLogin")WebElement clkLogin;
@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[11]/a") WebElement changepass;
@FindBy(how=How.NAME,using="oldpassword")WebElement oldpassword;
@FindBy(how=How.NAME,using="newpassword")WebElement newpassword;
@FindBy(how=How.NAME,using="confirmpassword")WebElement confnewpassword;
@FindBy(how=How.NAME,using="sub")WebElement submitPassword;
public void setUserID(String userID) {
	
	userid.sendKeys(userID);
	}

public void setPassword(String pasword) {
	
	password.sendKeys(pasword);
	}

public void loginButton() {

clkLogin.click();

}
public void clk_ChangePass() {
	changepass.click();
	}

public void set_olddPassword(String oldpasword) {
	
	oldpassword.sendKeys(oldpasword);
	}
public void set_newPassword(String newpasword) {
	
	newpassword.sendKeys(newpasword);
	}
public void set_confirmPassword(String confirmpasword) {
	
	confnewpassword.sendKeys(confirmpasword);
	}


public void clk_submitPassword() {
	
	submitPassword.click();;
	}

}