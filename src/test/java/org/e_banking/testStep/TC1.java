package org.e_banking.testStep;

import java.io.IOException;
import java.util.Set;

import org.e_banking.base.Base;
import org.e_banking.page.managerPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base {
	@Test
	public void SM1() throws IOException, InterruptedException {
		
	driver.get(pr.getProperty("url"));
	managerPage mlog=new managerPage(driver, pr);	
	mlog.setUserID(pr.getProperty("userID"));
	mlog.setPassword(pr.getProperty("password"));	
	mlog.loginButton();
	mlog.clk_ChangePass();
	try {
		WebDriverWait wit=new WebDriverWait(driver, 10);
		if(wit.until(ExpectedConditions.alertIsPresent())==null)
		{
			
			System.out.println("alart not present");
		}
		else {
			
			Alert alt=driver.switchTo().alert();
			alt.dismiss();
			alt.accept();
			
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	mlog.set_olddPassword("raj12345");
	mlog.set_newPassword("123456");
	mlog.set_confirmPassword("123456");
	mlog.clk_submitPassword();
      try {
    	  Alert alt = driver.switchTo().alert();
    	  
    	 String alttext = alt.getText();
    	  System.out.println(alttext);
    	  String exceptedAlt="Please fill all fields";
    	  Assert.assertEquals(alttext, exceptedAlt);
    	  System.out.println("test pass");
    	  alt.accept();
      }
      catch(Exception e) {
	e.printStackTrace();
	}
     //For correct password change 
      mlog.set_olddPassword("mngr442382");
      mlog.set_newPassword("123457");
      mlog.set_confirmPassword("123457");
      mlog.clk_submitPassword();
      Thread.sleep(5000);
      try {
    	  
    	  Alert alt=driver.switchTo().alert();
    	  String alttext = alt.getText();
    	  String expectedText = "Password is changed";
    	 Assert.assertEquals(alttext, expectedText);
    	 System.out.println("test is pass");
    	 Thread.sleep(5000);
    	 alt.accept();
    	 
       }
      catch(Exception e)
      {
    	  System.out.println("test is fail");
    	  e.printStackTrace();
      }
	
      String gettitle = driver.getTitle();
      System.out.println(gettitle);
      //expectedtitle=""
	}
	
 }
