package VeryFicationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipaleVerification {
  
	  
		@Test
		  public void myMethad() 
		  {
			  String a="bhopal";
			  String b="amravati";
			  
			  Assert.assertNull(a, b);
			  
			  Assert.assertNotNull(b,"Tc is failed values is null " );
			  
		  }
	}


