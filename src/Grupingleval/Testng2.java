package Grupingleval;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng2 {
  
	@Test(groups = {"sanity"})
	  public void w() 
	  {
	  //   Assert.fail();
		  Reporter.log("w is running sanity",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void x()
	  {
		  Reporter.log("x is running regression",true);
	  }
	  
	  @Test(groups = {"sanity"})

	  public void y()
	  {
		  Reporter.log("y is running sanity",true);
	  }
	  
	  @Test(groups = {"regression"})

	  public void z()
	  {
		  Reporter.log("z is running regression",true);
	  }
	  

}
