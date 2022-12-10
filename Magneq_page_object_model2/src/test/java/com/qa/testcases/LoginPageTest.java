package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.PropertyUtils;

public class LoginPageTest {
	
	BaseClass baseclass=new BaseClass();
	LoginPage loginpage;
	HomePage homepage;
	@BeforeTest
	public void setUp() {
		
		baseclass.setUpBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
	}
    @Test(priority = 1)
    public void loginTest() throws Exception {
    	homepage=new HomePage();
    	loginpage=new LoginPage();
    	loginpage.login(PropertyUtils.getProperty("username"), PropertyUtils.getProperty("password"));
    	Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void  loginPageTitle() throws InterruptedException {
    homepage=new HomePage();
    loginpage=new LoginPage();
    String title=loginpage.validateLoginPageTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Login: Mercury Tours");
    	Thread.sleep(3000);
    	
    }
    @AfterTest
    public void close() {
    //	baseclass.tearDown();
    }
    
}
