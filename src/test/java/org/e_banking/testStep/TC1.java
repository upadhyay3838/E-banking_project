package org.e_banking.testStep;
import java.io.IOException;
import org.e_banking.base.Base;
import org.e_banking.page.Change_password;
import org.e_banking.page.Manager_LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base {
	@Test
	public void SM1() throws IOException, InterruptedException {
		
	driver.get(pr.getProperty("url"));
	Manager_LoginPage mlog=new Manager_LoginPage(driver, pr);
	Change_password changp=new Change_password(driver, pr);	
	mlog.setUserID(pr.getProperty("userID"));
	mlog.setPassword(pr.getProperty("password"));	
	mlog.loginButton();
	changp.clk_ChangePass();
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
	
	changp.set_olddPassword("raj12345");
	changp.set_newPassword("123456");
	changp.set_confirmPassword("123456");
	changp.clk_submitPassword();
      try {
    	  Alert alt = driver.switchTo().alert();
    	  
    	 String alttext = alt.getText();
    	  System.out.println(alttext);
    	  String exceptedAlt="Please fill all fields";
    	  Assert.assertEquals(alttext, exceptedAlt);
    	  System.out.println("test 1st is pass");
    	  Thread.sleep(5000);
    	  alt.accept();
    	  alt.dismiss();
    	//For correct password change	  
    	  if(alttext.equals(exceptedAlt)){
    		  changp.set_olddPassword("asejane");
    		  changp.set_newPassword("123456");
    		  changp.set_confirmPassword("123456");
    		  changp.clk_submitPassword();
    	      Thread.sleep(5000);
    	
    	      alt=driver.switchTo().alert();
        	  String altext = alt.getText();
        	  String expectedText = "Password is changed";
        	 Assert.assertEquals(altext, expectedText);
        	 System.out.println("test  2 is pass");
        	 Thread.sleep(5000);
        	 alt.accept();
        	 alt.dismiss();
    	      
    	      
    	  }
      }
      catch(Exception e) {
	e.printStackTrace();
	}
      
     }
}