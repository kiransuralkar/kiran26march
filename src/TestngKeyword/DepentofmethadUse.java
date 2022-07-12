package TestngKeyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DepentofmethadUse {
  
	@Test
	  public void d()
	  {
	//	Assert.fail();
		  Reporter.log("d is running",true);
	  }
	  
	  @Test(dependsOnMethods = {"d"},priority = -2)  //use for 2 methad any time
	  public void a()
	  {
		  Reporter.log("a is running",true);
	  }
	  
	  @Test()
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
	  
	  
	  
	  
	  

  }

