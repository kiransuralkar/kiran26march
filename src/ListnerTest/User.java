package ListnerTest;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



 @Listeners(ListnerTest.Listnar.class)
public class User {
	
  @Test
  public void mymethod1()
  {
	  Reporter.log("my method 1 pass");
	  
  }
  
  
  @Test
  public void mymethod2()
  {
	  Assert.fail();
	  Reporter.log("Take scrinshot   ");
  }
  
  
   @Test(dependsOnMethods = "mymethod2")
   public void mymethod3()
  {
	 Reporter.log("my method 3 skip");
		    
  }
 }





