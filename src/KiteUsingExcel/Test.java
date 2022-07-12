package KiteUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		 
		   File	myfile=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\kiran.xlsx");
			
		   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

	   String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
	   String PWD = mySheet.getRow(4).getCell(1).getStringCellValue();
	   String PIN = mySheet.getRow(4).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		kitelogin login=new kitelogin(driver);
		login.senduserName(UN);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
		
		
		Thread.sleep(2000);
		KitePin pin =new KitePin(driver);
		pin.sendpin(PIN);
		pin.clickOnContinueButton();
		
		
		Thread.sleep(2000);
		Kitehome home=new Kitehome(driver);
		home.ValidateUserName(UN);
		home.logOut();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
