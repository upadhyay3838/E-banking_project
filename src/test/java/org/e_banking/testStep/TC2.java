package org.e_banking.testStep;

import org.e_banking.base.Base;
import org.e_banking.page.Add_New_Customer;
import org.e_banking.page.Manager_LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends Base{
	Alert alt;
	@Test
	public void SM4() throws InterruptedException {
		 
		Manager_LoginPage login=new Manager_LoginPage(driver, pr);
		Add_New_Customer addcus=new Add_New_Customer(driver, pr);
		login.setUserID(pr.getProperty("userID"));
		login.setPassword(pr.getProperty("password"));
		login.loginButton();
		addcus.Add_Customer();
        Thread.sleep(5000);
		addcus.Set_customer_Name("Raj");
		addcus.Set_Gender_Male();
		addcus.Set_DateOf_Birth("04-11-2013");
		addcus.Set_Address("Jamnagar");
		addcus.Set_City("Jamnagar");
		addcus.Set_State("Gujarat");
		addcus.Set_Pin("567321");
		addcus.Set_Moblile_No("8000439024");
		addcus.Set_Email("1234raj@gmail.com");
		addcus.Set_Password("12345");
		addcus.Submit();
		
					
		
		  try {
			
			 String result = addcus.Registered_Customer_details();
		   	 System.out.println(result);
		   	 System.out.println(addcus.ExpectedResult_Successfull);
		    Assert.assertEquals(result, addcus.ExpectedResult_Successfull);
		    
		  }
		  catch(Exception e) {
			  alt=driver.switchTo().alert();
			  System.out.println(addcus.ExpectedResult_AlreadyExist+"plz enter with new email id");
			alt.accept();
			e.printStackTrace();

		 }
		  
		  
		// new account varification
		  addcus.clk_addNewAcc(); 
		driver.switchTo().activeElement().clear();
		  addcus.Set_CustomerID("10291");
		  addcus.Set_inideposit("500");
		  addcus.clk_Button();
		  try {
			  String result = addcus.Account_confirmation();
			  System.out.println(result);
			  Assert.assertEquals(result, addcus.Account_confirmation);
			  System.out.println("Acount created successfully");
			  
		  }catch(Exception e) {
			  e.printStackTrace();
			  
			  
		 }
		  
		  
}




}	



