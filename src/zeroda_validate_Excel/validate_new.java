package zeroda_validate_Excel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import zerodaKite_Using_Excel_Testng.KiteHomePage1;
import zerodaKite_Using_Excel_Testng.KiteLoginPage1;
import zerodaKite_Using_Excel_Testng.KitePinPage1;
import zeroda_Excel_Base.base_new;
import zeroda_Utility_Excel.Utility_new;

public class validate_new extends base_new{
    
	KiteHomePage1 home;
	KiteLoginPage1 login;
	KitePinPage1 pin;
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login= new KiteLoginPage1(driver);
	pin= new KitePinPage1(driver);
	home= new KiteHomePage1(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(Utility_new.readDataFromExcel(0, 0));
	login.sendPassword(Utility_new.readDataFromExcel(0, 1));
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPin(Utility_new.readDataFromExcel(0, 2));
	pin.clickOnContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), Utility_new.readDataFromExcel(0, 0),"Actual and Expected are not matching TC is failed");
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	home.logOut();
  }
}
