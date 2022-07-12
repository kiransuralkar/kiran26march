package zerodaKite_Using_Excel_Testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validate1 {
  

	   WebDriver driver;
		Sheet mySheet;
		KiteLoginPage1 login;
		KitePinPage1 pin;
		KiteHomePage1 home;
		
		
		@BeforeClass
		public void launchBrowser() throws EncryptedDocumentException, IOException{
			System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
					+ "\\SeleniumTest");
			//ChromeOptions opt= new ChromeOptions();
			//opt.addArguments("--headless");
			//opt.addArguments("--disable-notifications");
			//opt.addArguments("incognito");
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Reporter.log("Launching browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			

			   
			File myfile=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\Velocity.xlsx");
			 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");	
			
			
			 login = new KiteLoginPage1(driver);
			 pin = new KitePinPage1(driver);
			 home = new KiteHomePage1(driver);
			
		}
		
		@BeforeMethod
		public void loginToKiteApp()
		{

			
			String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
			String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
			String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
			
			
		//	login.sendUserName(UN);
			login.sendUserName(UN);
			Reporter.log("sending username",true);
			
			login.sendPassword(PWD);
			Reporter.log("sending password",true);
			
			login.clickOnLoginButton();
			Reporter.log("clicking on login button",true);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			pin.sendPin(PIN);
			Reporter.log("sending PIN",true);
			
			pin.clickOnContinueButton();
			Reporter.log("clicking on continue button",true);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
		
		
		@Test
		public void validateUserName()
		{
			String expectedUN = mySheet.getRow(0).getCell(0).getStringCellValue();
			String actualUN = home.getActualUserName();
			Reporter.log("Validating UserName",true);
			Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
			Reporter.log("Actual and Expected UN are matching TC PASSED",true);
		
		}
		
		@AfterMethod
		
			public void logoutFromKiteApp() throws InterruptedException
			{
			home.logOut();
			Reporter.log("logging out...",true);
			}
		
		@AfterClass
		public void closeBrowser() throws InterruptedException
		
			{
				Thread.sleep(2000);
				Reporter.log("Closing browser",true);
				driver.close();
			}
		}


  

