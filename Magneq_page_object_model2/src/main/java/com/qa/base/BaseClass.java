package com.qa.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.qa.util.PageUtils;
import com.qa.util.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static  WebDriver driver;
	
	@BeforeTest
 public void setUpBrowser() {
	String browserName= PropertyUtils.getProperty("browser");
	switch (browserName.toLowerCase()){
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
		default :
			System.out.println("\nEnter valid browser from the list :chrome,firefox,edge drivers only");
			break;
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PageUtils.IMPLICIT_WAIT));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PageUtils.PAGE_LOAD_TIMEOUT));
	

  }
   public static WebDriver getDriver() {
	return driver;
	
 }
   public void tearDown() {
	   driver.quit();
 }







}