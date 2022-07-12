package ListnerMaven;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class listnerclass extends baseclass implements ITestListener {

	 baseclass b=new baseclass();
		
		@Override
		public void onTestSuccess(ITestResult result) {
		
			Reporter.log("congralution tc is pass,passed tc name is"+result.getName(),true);
			
		}	
			
		
		@Override
		public void onTestFailure(ITestResult result) {
		
			String name = result.getName();
			   Reporter.log("sorry tc is failed,failed tc name is"+result.getName(),true);
			   try {
				   b.captureScreenshot(name);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
			
		
		

}
