package kiteValidate;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import kiteBase.BaseProperity;
import kiteutility.Utilityproperity;
@Listeners(kiteutility.Listner.class)                         //new add L
public class Validateproperity extends BaseProperity {         //new add 
    zerodaKite_Using_Excel_Testng.KiteHomePage1 home;
    zerodaKite_Using_Excel_Testng.KiteLoginPage1 login;
    zerodaKite_Using_Excel_Testng.KitePinPage1 pin;
    String TCID="555";
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new zerodaKite_Using_Excel_Testng.KiteLoginPage1(driver);
		pin=new zerodaKite_Using_Excel_Testng.KitePinPage1(driver);
		home=new zerodaKite_Using_Excel_Testng.KiteHomePage1(driver);
		
	}
	
	@BeforeMethod
	public void loginkiteApp() throws IOException
	{
		login.sendUserName(Utilityproperity.getDataFromproperityfile("UN"));
		login.sendPassword(Utilityproperity.getDataFromproperityfile("PWD"));
		login.clickOnLoginButton();
		
		pin.sendPin(Utilityproperity.getDataFromproperityfile("PIN"));
		pin.clickOnContinueButton();
	}
	
	@Test
	public void validateUserID() throws IOException
	{
	  
	Assert.assertEquals(home.getActualUserName(),Utilityproperity.getDataFromproperityfile("UN"));
//	Utilityproperity.captureScreenshot(driver, TCID);
		Assert.fail();
	}
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.logOut();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	     driver.close();
	}
	
}
