package kiteBase;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteutility.Utilityproperity;


    public class BaseProperity {
    protected	WebDriver driver;
    public void openBrowser() throws IOException {

		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest"); ///
    	ChromeOptions opt=new ChromeOptions();
    	opt.addArguments("--disable-notifications");
    	driver=new ChromeDriver(opt);
    	driver.manage().window().maximize();
    	driver.get(Utilityproperity.getDataFromproperityfile("URL"));
    	Reporter.log("launcging browser",true);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    	
    	
    	
    }
    	
    //	public static void captureScreenshot(WebDriver driver ,String TCID) throws IOException {
    		
   // 		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
   // 		 File dest=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\Listner1234"+TCID+".png");	
   // 			FileHandler.copy(src, dest);
    		
    	
    	
    	
    	
    	
	
}
