package ListnerMaven;

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



public class baseclass {

	static protected	WebDriver driver;
	    public void openBrowser() throws IOException {

			System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
					+ "\\SeleniumTest"); ///
	    	ChromeOptions opt=new ChromeOptions();
	    	opt.addArguments("--disable-notifications");
	    	driver=new ChromeDriver(opt);
	    	driver.manage().window().maximize();
	    	driver.get(utilityclass.getDataFromproperityfile("URL"));
	    	Reporter.log("launcging browser",true);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    	
	    }
	    	public static void captureScreenshot(String name) throws IOException {
	    		
	    		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	    		 File dest=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\Kite123"+name+".png");	
	    		 			    			FileHandler.copy(src, dest);
	    		

	    }
}
