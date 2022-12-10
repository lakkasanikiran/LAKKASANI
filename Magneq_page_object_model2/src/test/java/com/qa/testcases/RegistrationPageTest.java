package com.qa.testcases;

import java.beans.IntrospectionException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;
import com.qa.util.ExcelReader;
import com.qa.util.PropertyUtils;

public class RegistrationPageTest {
	BaseClass baseclass=new BaseClass();
	RegistrationPage registration;
	HomePage homepage;
	String sheetName="Register";
	
	
	@BeforeTest
	public void setUp() throws IntrospectionException{
		baseclass.setUpBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
		BaseClass.getDriver().manage().window().maximize();
	}
	
	
	@DataProvider
	public Object[][] getTestData(){
		Object data[][]=ExcelReader.getTestData(sheetName);
		return data;
		
	}
	@Test (priority = 1, dataProvider="getTestData" )
	public void registerTest(String FirstName,String LastName,String Phone,String Email,
			String Address,String City, String State,String PostalCode,String Country,
			String UserName,String Password,String ConfirmPassword)throws Exception
	{
		homepage =new HomePage();
		registration=new RegistrationPage();
		
		
		homepage.registeroperation();
		Thread.sleep(3000);
		registration.registration(FirstName, LastName, Phone, Email, Address, City, State, PostalCode, Country, UserName, Password, ConfirmPassword);
		
		//registration.registration(LastName, Email, Phone, Country, Address, City, State, PostalCode, Country, UserName, Password, ConfirmPassword);
	
	Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void registrationPageTextTest() throws Exception {
		homepage=new HomePage();
		
	registration=new RegistrationPage();
	String actual =registration.validateRegistration();
	if(actual.contains("Thank you for registering"))
	{
		System.out.println("registration completed sucssfully");
	}else
	{
		System.out.println("Registration failure");
	}
	 Thread.sleep(3000);
		
		
	}
	
	@AfterTest 
	public void tearDown(){
		
		baseclass.tearDown();
	}
	
	
	

}
