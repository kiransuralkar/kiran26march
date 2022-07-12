package VeryFicationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void myMethad()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(b,"Tc is failed value is false");
	  Reporter.log("TC is passed values is true",true);
  }
}
