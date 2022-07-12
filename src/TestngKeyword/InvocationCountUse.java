package TestngKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {

		  @Test(invocationCount=3)
		  public void MyTest() 
		  {
			  Reporter.log("hello",true);
		  }
			  
		  
		  @AfterMethod                
		  public void Test()
		  {
			 Reporter.log("hi",true); 
			  
			  
			  
			  
			  
		  }
		  

  }

