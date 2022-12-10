package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.util.PropertyUtils;

public class HomPageTest {

	BaseClass baseClass=new BaseClass();
	HomePage homePage;
	
	
@BeforeTest	
public void setUp() {
	baseClass.setUpBrowser();
	//Thread.sleep(3000);
	BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
	BaseClass.getDriver().manage().window().maximize();
	
}
@Test
public void homePageTitleTest() throws InterruptedException {
	homePage=new HomePage();
	String actualTitle=homePage.verifyHomePageTitle();
	String expectedTitle="Welcome: Mercury Tours";
	Assert.assertEquals(actualTitle, expectedTitle, "homepagefailure");
	
	Thread.sleep(3000);

}
	@AfterTest
   public void teardown() {
		//baseClass.tearDown();
	}
	
}
