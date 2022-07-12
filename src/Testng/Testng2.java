package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng2 {
  @Test
  public void TC0() {
	  
	  System.out.println("Running Test case 0");
  }
  
  
  // scenaro 2 :use of Reporter.log(,true);
  @Test
  public void TC1()
  {
	  Reporter.log("Running TC1",true);
  }
  
  
   //scenaro 3 :use of Reporter.log(.false/Null);
   @Test
   public void TC2()
   {
	Reporter.log("Running TC2",false);
   }
  
  
  @Test
  public void TC3()
  {
	  Reporter.log("Running TC3",true);
  }
  
  
  @Test
  public void TC4()
  {
	 Reporter.log("Running TC4" ); 
  }
  
  
  
  
  
  
  
  
  
  }

