package Demo_practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Small_project {
 public static WebDriver driver;
  @BeforeTest
  public void setup() {
	  WebDriverManager.chromedriver().setup();

	  driver=new ChromeDriver();
  } 
  @Test(priority = 1)
  public void linktext() {
	  driver.get("https://testpages.herokuapp.com/basic_html_form.html");
	  driver.manage().window().maximize();
  }
	  @Test(priority = 2)
	  public void userName() {
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kiran_chowdary");
	  }  
  @Test(priority = 3)
  private void pasword() throws InterruptedException {
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9550557565");
	Thread.sleep(2000);
}
  @Test(priority = 4)
  public void comment() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@name='comments']")).clear();
	  Thread.sleep(3000);
  }
  @Test(priority = 5)
  public void coment_add() {
	 driver.findElement(By.xpath("//*[@name='comments']")).sendKeys("hi welcome to my world");
  }
 @Test (priority = 6)
 public void redio() {
 List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='checkbo']"));
 int totalButtons=buttons.size();
 System.out.println("the total botton size= "+totalButtons);
 int expact=3;
 int actual=totalButtons;
 
 Assert.assertEquals(actual, expact);
 }
 @Test(priority = 7)
 public void checkbox() throws InterruptedException {
	 WebElement button=driver.findElement(By.xpath("(//input[@type='checkbox'][1])"));
	 button.click();
	 boolean expact=true;
	 boolean actual=button.isSelected();
	 
	 Assert.assertEquals(actual, expact);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@type='checkbox'][3])")).click();
	
 }
 @Test(priority = 8)
 public void radio() {
	 driver.findElement(By.xpath("(//input[@name='radioval'])[1]")).click();
 }
 @Test(priority = 9)
 public void select1() throws InterruptedException {
	 
	 driver.findElement(By.xpath("(//*[@name='multipleselect[]']/option)[2]")).click();
	 Thread.sleep(30000);
	 driver.findElement(By.xpath("(//*[@name='multipleselect[]']/option)[1]")).click();
 }
 @Test(priority = 10)
 public void dropdown() {
 WebElement ss=driver.findElement(By.xpath("//Select[@name='dropdown']"));
	 Select sc=new Select(ss);
	 System.out.println(ss.getText());
	 sc.selectByValue("dd6");
 }
 
 @Test(priority = 11)
 public void submit() {
	 driver.findElement(By.xpath("//input[@name='submitbutton'and@value='submit']")).click();
 }
@AfterTest
  public void afterTest() {
	//driver.quit();
	  
  }
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
