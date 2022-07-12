package ListnerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listnar implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Take scrinshot,please check tc ",true);
		Reporter.log("failed tc name is"+result.getName(),true);
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test case pass,please check tc ",true);
		Reporter.log("pass tc name is"+result.getName(),true);
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("test case skip,please check tc",true);
		Reporter.log("skipped tc name is"+result.getName(),true);
	}
	
	
	
	
	
	


}
