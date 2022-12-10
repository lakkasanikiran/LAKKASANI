package Moduler_driven_frame_work;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 {
	WebDriver driver;
	FileInputStream fis;
	 XSSFWorkbook wb; 
	 XSSFSheet ws;
	 Row r;
	
	
	
	@Test(priority = 1)
	public void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test (priority = 2)
	public void guru() throws Exception {
		
		//File file=new File("C:\\Users\\Soujanya\\OneDrive\\Desktop\\guru99.xlsx");
		fis=new FileInputStream("src/test/resources/ExcelFiles/guru99.xlsx");
		wb=new XSSFWorkbook(fis);
	     ws=wb.getSheet("Register");
	     int rowc=ws.getLastRowNum();
	     for(int i=1;i<rowc;i++) {
	     r=ws.getRow(i);
	   
	     Thread.sleep(3000);
	     
	    // driver.findElement(By.name("firstName")).clear();
	     
	     driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	    // driver.findElement(By.xpath("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	     driver.findElement(By.name("lastName")).clear();
	     driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
	    		 
	     
	     
	     }
		
	}
	
	
	
	
	
	

}
