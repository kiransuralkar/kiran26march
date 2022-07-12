package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
  
public class AnnoTationStudy {
  @Test
  public void validUserID() 
  
  
  {
	    Reporter.log(" user id validate" ,true);
  }  
	 @Test
	 public void valiadateDashboard()
	 {
		 Reporter.log(" dashboard validate",true);
	 }
	  
	 
	 @BeforeMethod
	public void loginkiteApp()
	{
		 Reporter.log("login suucess",true);
	}
	 
	 @AfterClass
	 public void launchbrowser()
	 {
		 Reporter.log("browser lunched",true);
	 }
	 
	 @AfterMethod
	 public void logoutfromkiteApp()
	 {
		 Reporter.log("logging out...",true);
	 }
	 
	 @AfterClass
	 public void closeBrowser()
	 {
		 Reporter.log("browser close",true);
	 }
	 
	 
	 
	 
} 
	 
	 
  
}
