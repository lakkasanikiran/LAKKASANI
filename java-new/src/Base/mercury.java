package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mercury{

	static WebDriver driver;
	
	   
		@BeforeTest
		public void lunch() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soujanya\\eclipse-workspace\\java-new\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.findElement(By.xpath("//a[@id='flights']")).click();
		 driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
}
	@Test(priority = 1)
	public void kiran() {
		driver.findElement(By.xpath("hotels")).click();
	}

}