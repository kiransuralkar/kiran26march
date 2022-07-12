package VeryFicationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse {
  
	@Test
	  public void myMethad()
	  {
		  boolean a=true;
		  boolean b=false;
		  
		  Assert.assertFalse(a,"Tc is failed value is false");
		  Reporter.log("TC is passed values is true",true);
	  }

}
