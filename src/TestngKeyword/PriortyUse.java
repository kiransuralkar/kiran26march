package TestngKeyword;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class PriortyUse {
  @Test(priority = -2)
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  
  @Test
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  
  @Test(priority = -1)
  public void v()
  {
	  Reporter.log("v is running",true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
