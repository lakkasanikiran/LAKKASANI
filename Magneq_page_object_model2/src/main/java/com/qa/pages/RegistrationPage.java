package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegistrationPage {
	
	
	
	public  RegistrationPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
     WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="submit")
	WebElement submit;
	
	
	@FindBy(xpath = "(//font[@face='Arial, Helvetica, sans-serif'])[3]")
	WebElement actualTxt;
	
    
	
	
	
public void registration(String fn, String ln, String ph, String un, String addr, String c, String st, String pc, String coun,String e, String pwd, String cpwd) throws Exception {

	firstname.sendKeys(fn);
	lastname.sendKeys(ln);
	phone.sendKeys(ph);
	username.sendKeys(un);
	address.sendKeys(addr);
	city.sendKeys(c);
	state.sendKeys(st);
	postalcode.sendKeys(pc);
	country.sendKeys(coun);
	email.sendKeys(e);
	password.sendKeys(pwd);
	confirmpassword.sendKeys(cpwd);
	
}






  public String validateRegistration () {
	 
	  
	  return actualTxt.getText();
	 
	 
  }
  

}
