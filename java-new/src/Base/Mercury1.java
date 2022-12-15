package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mercury1 {
	
	 
	WebDriver driver;
	
	@BeforeTest
	public void lunch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soujanya\\eclipse-workspace\\java-new\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("")).click();
		
	}
		@Test
		public void kiran() throws InterruptedException {
			Thread.sleep(9000);
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


