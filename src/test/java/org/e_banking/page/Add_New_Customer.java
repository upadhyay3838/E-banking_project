package org.e_banking.page;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Customer {
	WebDriver driver;
	Properties pr;
public	String ExpectedResult_Successfull="Customer Registered Successfully!!!";
public	String ExpectedResult_AlreadyExist="Email Address Already Exist !!";
public String Account_confirmation="Account Generated Successfully!!!";


public	Add_New_Customer(WebDriver driver,Properties pr ){
		this.pr=pr;
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")WebElement addCustomer;
@FindBy(how=How.NAME,using="name")WebElement name;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")WebElement gender_M;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")WebElement gender_F;
@FindBy(how=How.NAME,using="dob")WebElement date_B;
@FindBy(how=How.NAME,using="addr")WebElement addres;
@FindBy(how=How.NAME,using="city")WebElement city;
@FindBy(how=How.NAME,using="state")WebElement state;
@FindBy(how=How.NAME,using="pinno")WebElement pin;
@FindBy(how=How.NAME,using="telephoneno")WebElement mobileNumber;
@FindBy(how=How.NAME,using="emailid")WebElement e_mail;
@FindBy(how=How.NAME,using="password")WebElement password;
@FindBy(how=How.NAME,using="sub")WebElement submit;
@FindBy(how=How.NAME,using="res")WebElement reset;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td/a") WebElement Continue;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")WebElement detail;


public void Add_Customer() {
	addCustomer.click();
}

public void Set_customer_Name(String customerName) {
	name.sendKeys(customerName);
	}

public void Set_Gender_Male() {
	gender_M.click();
	}
public void Set_Gender_Female() {
	gender_F.click();
	}

public void Set_Address(String Address) {
	addres.sendKeys(Address);
	}
public void Set_City(String City) {
	city.sendKeys(City);
	}
public void Set_DateOf_Birth(String Birth) {
	date_B.sendKeys(Birth);
	}
public void Set_State(String State) {
	state.sendKeys(State);
	}
public void Set_Pin(String Pin) {
	pin.sendKeys(Pin);
	}
public void Set_Moblile_No(String MobileNo) {
	mobileNumber.sendKeys(MobileNo);
	}
public void Set_Email(String Email) {
	e_mail.sendKeys(Email);
	}

public void Set_Password(String Password) {
	password.sendKeys(Password);
	}
public void Submit() {
	submit.click();;
	}
public void Reset() {
	reset.click();
	}

public void Clk_contine() {
	
	Continue.click();
}
public String Registered_Customer_details() {
	
	String details = detail.getText();
	return details;
	
}

//add new account

@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[5]/a")WebElement add_NewAccount;
@FindBy(how=How.NAME,using="cusid")WebElement cusID;
@FindBy(how=How.NAME,using="selaccount")WebElement Acc_type;
@FindBy(how=How.NAME,using="inideposit")WebElement ini_deposit;
@FindBy(how=How.NAME,using="button2")WebElement sub_button;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")WebElement getacc_mess;

public void clk_addNewAcc() {
	add_NewAccount.click();
	}
public void Set_CustomerID(String customerID) {
	cusID.sendKeys(customerID);
	}
public void set_Account_type(String Account_type) {
	Acc_type.click();
	}
public void Set_inideposit(String inideposit) {
	ini_deposit.sendKeys(inideposit);
	}
public void clk_Button() {
	sub_button.click();
	}
public String Account_confirmation() {
	String Account = getacc_mess.getText();
	return Account;
}



}