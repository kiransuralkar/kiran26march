package VeryFicationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotNullUse {
  
	@Test
	  public void f()
	  {
		  String a=null;
		  String b="abc";
		  
	//	  Assert.fail();
		  	Assert.assertNotNull(b,"value is not null TC is failed");
		  	Reporter.log("TC is passed value is true",true);
		  	
	//	  	Assert.fail();
	  }
	}

