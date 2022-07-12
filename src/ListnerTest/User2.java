package ListnerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class User2 {
  

	  @Test
	  public void mymethod4()
	  {
		  Reporter.log("my method 4 pass");
		  
	  }
	  
	  
	  @Test
	  public void mymethod5()
	  {
		  Assert.fail();
		  Reporter.log("Take scrinshot   ");
	  }
	  
	  
	   @Test(dependsOnMethods = "mymethod5")
	   public void mymethod6()
	  {
		 Reporter.log("my method 6 skip");
			    
  }
}