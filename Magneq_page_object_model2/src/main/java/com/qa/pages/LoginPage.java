package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage {

	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(),this);	
	}
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pasword;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	
	
	
	public void login(String un, String pwd) throws Exception
	
	{
		System.out.println(un);
		System.out.println(pwd);
		Thread.sleep(3000);
		username.sendKeys(un);
		pasword.sendKeys(pwd);
		submit.click();
	}
	public String validateLoginPageTitle() {
		
		return BaseClass.getDriver().getTitle();
		
	}

}
