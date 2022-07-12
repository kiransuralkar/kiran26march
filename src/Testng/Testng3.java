package Testng;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng3 {
  @BeforeClass
  public void Facebook() {
	  
	  
      System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");

	  Reporter.log("I have a nice day");
	
  }
  @Test
  public void KiteApp() throws EncryptedDocumentException, IOException
  {
	  
	  File myfile = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");

	  Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
      String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
	  String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
	  
	  

      System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://kite.zerodha.com/");

	  WebElement UID = driver.findElement(By.id("userid"));
	  WebElement pwd = driver.findElement(By.id("password"));
      WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	  
	  UID.sendKeys(UN);
	  pwd.sendKeys(PWD);
	  LoginButton.click();
	  
	  
	  Reporter.log("good mornning",true);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
