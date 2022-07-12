package VeryFicationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EqulesTcpass {
  @Test
  public void myMethad() 
  {
	  String a="bhopal";
	  String b="bhopal";
	  
	  Assert.assertEquals(a, b," a and b values not maching Tc failed");
	  Reporter.log("a and b values are matching TC passed",true);
	  
  }     
}
