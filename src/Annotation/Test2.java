package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	  public void rechargePhone()
	  {
		Reporter.log("Recharge done",true);  
	  }
	  
	  @BeforeMethod
	  public void loginToRechargePortal()
	  {
		  Reporter.log("login success",true);
	  }
		  
		@AfterMethod
		public void logoutFromRechargePortel()
		{
			Reporter.log("logout done",true);
		}
		  
		@BeforeClass
		public void lounchBrowser()
		{
			Reporter.log("browser lunched",true);
		}
		  
		 @AfterClass
		 public void Browser()
		 {
			 Reporter.log("browser closed",true);
		 }
		  
		  
		  
		  
		  
		  

  }

